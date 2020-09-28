package cn.ecut.dao;

import cn.ecut.domain.User;

/**
 * @author Wko
 */
public interface UserDao {

    /**
     * 根据用户名查询信息
     * @param username 用户名
     * @return 返回user对象
     */
    User findByusername(String username);
    /**
     * 用户保存
     * @param user 对象
     * @return 返回user对象
     *
     */
    void save(User user);

    /**
     * 根据激活码查询用户对象
     * @param code 激活码
     * @return user对象
     */
    User findCode(String code);
    /**
     * 设置激活状态
     * @param user 用户
     */
    void updataStatus(User user);

    /**
     * 匹配用户名与密码
     * @param username 用户名
     * @param password 密码
     * @return boolean
     */
    User findByUsernameAndPassword(String username, String password);
}
