package cn.dksy.domain;

import lombok.Data;

/**
 * @author JAVASM
 * @title: Level
 * @projectName ssm_diy
 * @description: TODO
 * @date 2019/8/22 17:04
 */

public class Level {
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

    public Level(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Level() {
    }

    @Override
    public String toString() {
        return "Level{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}