package com.choi.entity;

public class Data {
    private String subject;
    private String summary;
    private String cover;
    private String pic;
    private String format;
    private String changed;

    public Data() {
    }

    public Data(String subject, String summary, String cover, String pic, String format, String changed) {
        this.subject = subject;
        this.summary = summary;
        this.cover = cover;
        this.pic = pic;
        this.format = format;
        this.changed = changed;
    }

    @Override
    public String toString() {
        return "Data{" +
                "subject='" + subject + '\'' +
                ", summary='" + summary + '\'' +
                ", cover='" + cover + '\'' +
                ", pic='" + pic + '\'' +
                ", format='" + format + '\'' +
                ", changed='" + changed + '\'' +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }
}
