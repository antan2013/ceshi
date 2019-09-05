package cn.dksy.domain;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author JAVASM
 * @title: Account
 * @projectName ssm_diy
 * @description: 账户实体类
 * @date 2019/8/21 20:28
 */

public class Account {

    private Integer id;
    private String name;
    private Float money;

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

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Account(String name, Float money) {
        this.name = name;
        this.money = money;
    }

    public Account(Integer id, String name, Float money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Account() {
    }
}