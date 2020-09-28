package cn.ecut.domain;

import java.io.Serializable;

/**
 * 商家实体类:
     * 商家id
     * 商家名称
     * 商家电话
     * 商家地址
 * @author Wko
 */
public class Seller implements Serializable {
    private int sid;
    private String sname;
    private String consphone;
    private String address;

    public Seller(){}

    public Seller(int sid, String sname, String consphone, String address) {
        this.sid = sid;
        this.sname = sname;
        this.consphone = consphone;
        this.address = address;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getConsphone() {
        return consphone;
    }

    public void setConsphone(String consphone) {
        this.consphone = consphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
