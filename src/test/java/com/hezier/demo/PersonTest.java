package com.hezier.demo;

import com.hezier.demo.bean.PersonBean;
import com.hezier.demo.service.PersonService;
import net.sf.json.JSONArray;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PersonTest {
    private static PersonService personService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        personService = (PersonService) act.getBean("personServiceImpl");
    }

//    @Test
//    public void save() {
//        PersonBean person = new PersonBean("Kemosabe");
//        personService.save(person);
//        PersonBean person = new PersonBean("anna");
//        person.setId(33);
//        personService.save(person);
//        JSONObject demo = JSONObject.fromObject(person);
//        System.out.println(demo);
//        System.out.println();
//    }

    @Test
    public void update() {
        PersonBean person = personService.getPerson(12);
        person.setName("Hezier");
        personService.update(person);
    }
//
//    @Test
//    public void getPerson() {
//        PersonBean person = personService.getPerson(2);
//        System.out.println(person.getName());
//    }
//
//    @Test
//    public void delete() {
//        personService.delete(1);
//    }

    @Test
    public void getAll() {
        List<PersonBean> arr = personService.getAllPerson();
        JSONArray jsonArray = JSONArray.fromObject(arr);
        System.out.println(jsonArray);
    }
}
