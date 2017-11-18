package com.hezier.demo;

import com.hezier.demo.bean.*;
import com.hezier.demo.service.PersonService;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    private static PersonService personService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        personService = (PersonService) act.getBean("personService");
    }

    @Test
    public void save() {
        personService.save(new PersonBean("wyy"));
    }

    @Test
    public void update() {
        PersonBean person = personService.getPerson(2);
        person.setName("wy");
        personService.update(person);
    }

    @Test
    public void getPerson() {
        PersonBean person = personService.getPerson(2);
        System.out.println(person.getName());
    }

    @Test
    public void delete() {
        personService.delete(1);

    }
}
