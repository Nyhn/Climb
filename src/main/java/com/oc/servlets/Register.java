package com.oc.servlets;

import com.oc.dao.PersonDAO;
import com.oc.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Register")
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private PersonDAO personDAO;

    public void init() throws ServletException{
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        PersonDAO personDAO = context.getBean(PersonDAO.class);
        Person person = new Person();
        String nom = request.getParameter("nom");
        String pays = request.getParameter("pays");
        person.setName(nom);
        person.setCountry(pays);
        personDAO.save(person);
        request.setAttribute("user",person);
        context.close();
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        PersonDAO personDAO = context.getBean(PersonDAO.class);
        List<Person> personList = personDAO.list();
        request.setAttribute("users",personList);
        context.close();
        this.getServletContext().getRequestDispatcher("/WEB-INF/view/register.jsp").forward(request,response);
    }
}
