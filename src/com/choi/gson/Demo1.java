package com.choi.gson;

import com.choi.entity.Score;
import com.choi.entity.Student;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {
    @Test
    public void test01(){
        String json = "{name:choi,age:19}";
        Gson gson = new Gson();
        //第二个参数为你的对象类型
        Student student = gson.fromJson(json, Student.class);
        System.out.println(student);
    }

    //2 json的嵌套
    @Test
    public  void test02(){
        String json = "{name:'Choi',age:20,score:{java:77.7,h5:55.5}}";
        Gson gson = new Gson();
        Student student = gson.fromJson(json, Student.class);
        System.out.println(student);

    }
    //3 解析数组对象的格式

    @Test
    public void test03(){
        String json ="[{java:49.4,h5:55.5},{java:33.3,h5:99.3}]";
        Gson gson = new Gson();
        //先将数组的类型进行转换
        // 实力化 TyToken ,TyToKen 的泛型为 fromJson() 返回的对象类型
        // 构造方法的访问修饰符如果为 protected ,需要 new 类名<泛型>(){};
        TypeToken<ArrayList<Score>> token = new TypeToken<ArrayList<Score>>(){};
        ArrayList<Score> list = gson.fromJson(json, token.getType());
        for (Score score:list){
            System.out.println(score);
        }
    }
}
