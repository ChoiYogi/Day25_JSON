package com.choi.JSON;

import com.choi.entity.Score;
import com.choi.entity.Student;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws JSONException {
        String json = "{name:'HelloWorld',age:18}";
        JSONObject jsonObject = new JSONObject(json);
        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        System.out.println(name+":"+age);
    }

    @Test
    public  void test01() throws JSONException {
        String json = "{name:'Choi',age:20,score:{java:77.7,h5:55.5}}";
        JSONObject object = new JSONObject(json);
        String name = object.getString("name");
        int age = object.getInt("age");
        JSONObject sObj = object.getJSONObject("score");
        double java = sObj.getDouble("java");
        double h5 = sObj.getDouble("h5");
        Score score = new Score(java, h5);
        Student student = new Student(name, age, score);
        System.out.println(student);
    }
    @Test
    public  void Test02() throws JSONException {
        String json ="[{java:49.4,h5:55.5},{java:33.3,h5:99.3}]";
        JSONArray jsonArray = new JSONArray(json);
        List<Score> list = new ArrayList<>();
        for(int i = 0; i < jsonArray.length();i++){
            //根据索引获取JSONObject的对象
            JSONObject jobj = jsonArray.getJSONObject(i);
            double java = jobj.getDouble("java");
            double h5 = jobj.getDouble("h5");
            Score score = new Score(java, h5);
            list.add(score);
        }
        System.out.println(list);

    }
}
