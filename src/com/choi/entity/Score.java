package com.choi.entity;

public class Score {
    private Double java;
    private Double h5;

    public Score() {
    }

    public Score(Double java, Double h5) {
        this.java = java;
        this.h5 = h5;
    }

    @Override
    public String toString() {
        return "Score{" +
                "java=" + java +
                ", h5=" + h5 +
                '}';
    }

    public Double getJava() {
        return java;
    }

    public void setJava(Double java) {
        this.java = java;
    }

    public Double getH5() {
        return h5;
    }

    public void setH5(Double h5) {
        this.h5 = h5;
    }
}
