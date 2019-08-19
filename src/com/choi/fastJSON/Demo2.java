package com.choi.fastJSON;

import com.choi.entity.Score;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        Score score =new Score(45.0,33.3);
        Gson gson = new Gson();
        String s = gson.toJson(score);
        System.out.println(s);

        List<Score> list = new ArrayList<>();
        list.add(score);
        list.add(new Score(33.3,44.4));

        String s1 = gson.toJson(list);
        System.out.println(s1);
    }
}
