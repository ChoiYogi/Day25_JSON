package com.choi.entity;

public class Pics {
    private Integer id;
    private String photo;
    private String subject;

    public Pics() {
    }

    public Pics(Integer id, String photo, String subject) {
        this.id = id;
        this.photo = photo;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Pics{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
