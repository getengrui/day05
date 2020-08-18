package com.bw.bean;

public class Meeting {
    private int id;
    private int code;
    private String name;
    private String stime;
    private String etime;
    private String ctime;
    private Type type;

    public Meeting() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", stime='" + stime + '\'' +
                ", etime='" + etime + '\'' +
                ", ctime='" + ctime + '\'' +
                ", type=" + type +
                '}';
    }
}
