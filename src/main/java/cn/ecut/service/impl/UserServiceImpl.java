package cn.ecut.service.impl;

import cn.ecut.dao.UserDao;
import cn.ecut.dao.impl.UserDaoImpl;
import cn.ecut.domain.User;
import cn.ecut.service.UserService;
import cn.ecut.util.MailUtils;
import cn.ecut.util.UuidUtil;

/**
 * @author Wko
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao=new UserDaoImpl();

    @Override

    /*
      注册用户
      @param user
     * @return  boolean
     */

    public boolean regist(User user){
        //查询用户名是否重复
        User u=userDao.findByusername(user.getUsername());
        if(u!=null){
            return false;
        }
        user.setCode(UuidUtil.getUuid());
        user.setStatus("N");
        userDao.save(user);
        //激活邮件发送，邮件正文
        String url="http://localhost:8087/travel_management_war_exploded/user/active?code="+user.getCode();
        String content="<a href="+url+">点击激活【旅游网】</a>";
        MailUtils.sendMail(user.getEmail(),content,"激活邮件");
        return true;
    }

    /**
     * 激活用户
     * @param code 激活码
     * @return code
     */
    @Override
    public boolean active(String code) {
        //根据激活码查询对象
        User user=userDao.findCode(code);
        if(user!=null){
            userDao.updataStatus(user);
            //调用方法修改激活status的状态
            return true;
        }else{
            return false;
        }

    }

    /**
     * 登录
     * @param user 对象
     * @return user对象
     */
    @Override
    public User login(User user) {
        return userDao.findByUsernameAndPassword(user.getUsername(),user.getPassword());
    }
}
