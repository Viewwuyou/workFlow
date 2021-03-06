package com.viewwuyou.workflow.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("checks")
public class CheckBack implements Serializable {
    private static final long serialVersionUID = 48L;

    private Integer id;
    private boolean result;
    private Application app;
    private String reason;
    private Manager manager;

    public CheckBack() {
    }

    public CheckBack(Integer id, boolean result, Application app, Manager manager, String reason) {
        this.id = id;
        this.result = result;
        this.app = app;
        this.manager = manager;
        this.reason = reason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Application getApp() {
        return app;
    }

    public void setApp(Application app) {
        this.app = app;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
