package com.oc.service;

import com.oc.model.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectionForm {
    private String result;

    public User checkLogin(HttpServletRequest request){
        String pseudo = request.getParameter("pseudo");
        String password = request.getParameter("password");
        User user = new User();
        return user;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void createCookieLog(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("pseudo",request.getParameter("pseudo"));
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);
    }
    public void getPseudoCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("pseudo")){
                    request.setAttribute("pseudo",cookie.getValue());
                }
            }
        }
    }
}
