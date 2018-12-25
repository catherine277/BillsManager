package com.newer.wangjiajie.app.domain;

/*
    bill的实体类
 */
public class Bill {
    private Integer id;//	货单编号
    private String name;//	收件人
    private String phone;//	收件人手机号
    private String address;//收件人地址
    private String sender;//	发件人
    private String sname;//	发件人手机号
    private Integer status;//	货单编号(数值型)
    /*
        生成构造方法
     */

    public Bill() {
    }
    /*
    生成对应的setter/getter方法
     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
