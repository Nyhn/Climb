package com.oc.main;

import com.oc.dao.UserDao;
import com.oc.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
        public static void main(String[] args) {

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/resources/spring.xml");

            UserDao userDao = context.getBean(UserDao.class);

            User user = new User();
            user.setName("Name");
            user.setFirstname("Firstname");
            user.setAddress("Adress");
            user.setMail("Mail");
            user.setPassword("Password");
            user.setPhone(0100000000);
            user.setPseudo("Pseudo");
            user.setSex(true);
            user.setZip(00000);

            userDao.save(user);

            System.out.println("Person::"+user);

            List<User> list = userDao.list();

            for(User p : list){
                System.out.println("User List::"+p);
            }
            //close resources
            context.close();
        }

}
