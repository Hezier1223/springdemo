package com.hezier.demo.json;

import com.hezier.demo.bean.Person;
import net.sf.json.JSONObject;

public class JsonToObject {

    /**
     * @param args
     */
    public void test() {

        System.out.println("将object对象，字符串转为json对象");

        Person person = new Person(1, "cgf");

        JSONObject json = JSONObject.fromObject(person);

        System.out.println(json);

        System.out.println("将字符串转成JSON对象，再转为自定义对象");

        String jsonString = "{" + "age" + ":1" + "," + "name" + ":" + "'wbj'" + "}";

        JSONObject jsonObject = JSONObject.fromObject(jsonString);

        System.out.println(jsonObject);

        Person person1 = (Person) JSONObject.toBean(jsonObject, Person.class);

        System.out.println("名字：" + person1.getAge() + "年龄:" + person1.getName());

        System.out.println("将Java对象转为json字符串");

        JSONObject json1 = JSONObject.fromObject(person);

        String jsonString1 = json1.toString();

        System.out.println(jsonString1);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        JsonToObject json = new JsonToObject();

        json.test();

    }

}
