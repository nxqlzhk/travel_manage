package cn.ecut.dao.impl;

import cn.ecut.dao.UserDao;
import cn.ecut.domain.User;
import cn.ecut.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Wko
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 根据用户名查询信息
     * @param username 用户名
     * @return 返回user对象
     *  * 定义sql语句
     *     * 执行sql
     */
    @Override
    public User findByusername(String username) {
        User user = null;
        String sql="select * from tab_user where username = ?";
        try {
             user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return user;
    }

    /**
     * 用户保存
     * @param user 对象
     * @return 返回user对象
     *  * 定义sql语句
     *  * 执行sql
     */
    @Override
    public void save(User user) {
        String s="insert into tab_user(username,password,name,birthday,sex,telephone,email,status,code) values(?,?,?,?,?,?,?,?,?)";
        template.update(s,
                user.getUsername(),
                user.getPassword(),
                user.getName(),
                user.getBirthday(),
                user.getSex(),
                user.getTelephone(),
                user.getEmail(),
                user.getStatus(),
                user.getCode()
        );
    }

    /**
     * 根据激活码查询用户对象
     * @param code 激活码
     * @return user
     */
    @Override
    public User findCode(String code) {
        User user = null;
        try {
            String sql = "select * from tab_user where code = ?";
            user = template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),code);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return user;
    }
    /**
     * 设置激活状态
     * @param user 用户
     */
    @Override
    public void updataStatus(User user) {
        String sql = " update tab_user set status = 'Y' where uid=?";
        template.update(sql,user.getUid());
    }

    /**
     * 匹配用户名与密码
     * @param username 用户名
     * @param password 密码
     * @return boolean
     */
    @Override
    public User findByUsernameAndPassword(String username, String password) {
        User user = null;
        try {
            String sql = "select * from tab_user where username = ? and password = ?";
            user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username,password);
        } catch (Exception ignored) { }
        return user;
    }
}
