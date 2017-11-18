package com.hezier.demo.bean;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    public Person(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Person(String personStr) {

    }

    public Person() {

    }
}
