package com.viewwuyou.workflow.domain;

import java.io.Serializable;

public class AttendType implements Serializable {
    private static final long serialVersionUID = 48L;

    private Integer id;
    private String name;

    public AttendType() {
    }

    public AttendType(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}