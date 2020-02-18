package com.oc.main;

import com.oc.dao.PersonDAO;
import com.oc.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
        public static void main(String[] args) {

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

            PersonDAO personDAO = context.getBean(PersonDAO.class);

            Person person = new Person();
            person.setName("Gaga"); person.setCountry("France");

            personDAO.save(person);

            System.out.println("Person::"+person);

            List<Person> list = personDAO.list();

            for(Person p : list){
                System.out.println("Person List::"+p);
            }
            //close resources
            context.close();
        }

}
