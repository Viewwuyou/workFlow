package com.viewwuyou.workflow.domain;

import java.io.Serializable;

public class Application implements Serializable {
    private static final long serialVersionUID = 48L;

    private Integer id;
    private String reason;
    private Attend attend;
    private AttendType type;

    public Application() {
    }

    public Application(Integer id, String reason, Attend attend, AttendType type) {
        this.id = id;
        this.reason = reason;
        this.attend = attend;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Attend getAttend() {
        return attend;
    }

    public void setAttend(Attend attend) {
        this.attend = attend;
    }

    public AttendType getType() {
        return type;
    }

    public void setType(AttendType type) {
        this.type = type;
    }
}
