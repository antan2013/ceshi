package cn.dksy.domain;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @author JAVASM
 * @title: Customer
 * @projectName ssm_diy
 * @description: TODO
 * @date 2019/8/22 16:14
 */


public class Customer {

    private Integer id;
    private String name;
    private Integer sid;
    private String source;
    private Integer indusid;
    private String industry;
    private Integer leid;
    private String level;
    private String phone;
    private String mobile;
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getIndusid() {
        return indusid;
    }

    public void setIndusid(Integer indusid) {
        this.indusid = indusid;
    }

    public Integer getLeid() {
        return leid;
    }

    public void setLeid(Integer leid) {
        this.leid = leid;
    }



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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    public Customer() {
    }

    public Customer(Integer id, String name, Integer sid, String source, Integer indusid, String industry, Integer leid, String level, String phone, String mobile) {
        this.id = id;
        this.name = name;
        this.sid = sid;
        this.source = source;
        this.indusid = indusid;
        this.industry = industry;
        this.leid = leid;
        this.level = level;
        this.phone = phone;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sid=" + sid +
                ", source='" + source + '\'' +
                ", indusid=" + indusid +
                ", industry='" + industry + '\'' +
                ", leid=" + leid +
                ", level='" + level + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}