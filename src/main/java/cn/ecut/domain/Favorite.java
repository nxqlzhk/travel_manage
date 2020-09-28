package cn.ecut.domain;

import java.io.Serializable;

/**
 * 收藏实体类：
    * 旅游线路对象
    * 收藏时间
    * 所属用户
 * @author Wko
 */
public class Favorite implements Serializable {
    private Route route;
    private String date;
    private User user;

    /**
     * 无参构造方法
     */
    public Favorite() {
    }

    public Favorite(Route route, String date, User user) {
            this.route = route;
            this.date = date;
            this.user = user;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
