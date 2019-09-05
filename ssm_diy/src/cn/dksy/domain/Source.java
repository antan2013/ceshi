package cn.dksy.domain;

import lombok.Data;

/**
 * @author JAVASM
 * @title: Source
 * @projectName ssm_diy
 * @description: TODO
 * @date 2019/8/22 17:03
 */
public class Source {

    private Integer id;
    private String name;

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

    public Source(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Source() {
    }

    @Override
    public String toString() {
        return "Source{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}