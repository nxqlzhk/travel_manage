package cn.ecut.domain;

import java.io.Serializable;

/**
 * 旅游线路图片实体类：
     * 商品图片id
    * 商品图片id
    * 旅游商品id
    * 详情商品大图
    * 详情商品小图
 * @author Wko
 */
public class RouteImg implements Serializable {
    private int rgid;
    private int rid;
    private String bigPic;
    private String smallPic;


    public RouteImg() {
    }

    public RouteImg(int rgid, int rid, String bigPic, String smallPic) {
        this.rgid = rgid;
        this.rid = rid;
        this.bigPic = bigPic;
        this.smallPic = smallPic;
    }

    public int getRgid() {
        return rgid;
    }

    public void setRgid(int rgid) {
        this.rgid = rgid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }
}
