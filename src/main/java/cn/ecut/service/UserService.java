package cn.ecut.service;

import cn.ecut.domain.User;

/**
 * @author Wko
 */
public interface UserService {
    /**
     * 注册用户
     * @param user 对象
     * @return  boolean
     */
     boolean regist(User user);

    /**激活用户
     * @param code 激活码
     * @return code
     */
    boolean active(String code);

    /**
     * 登录
     * @param user 对象
     * @return user对象
     */
    User login(User user);
}
