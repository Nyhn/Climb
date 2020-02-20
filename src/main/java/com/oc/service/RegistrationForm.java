package com.oc.service;

import com.oc.model.User;
import javax.servlet.http.HttpServletRequest;

public class RegistrationForm {
    private boolean result = true;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public User createUser(HttpServletRequest request){
        if(checkInformation(request)) {
            User user = new User();
            user.setPseudo(request.getParameter("pseudo"));
            user.setPassword(request.getParameter("password"));

            user.setName(request.getParameter("name"));
            user.setFirstname(request.getParameter("firstname"));
            user.setSex(Boolean.parseBoolean(request.getParameter("sex")));
            user.setAddress(request.getParameter("address"));

            user.setZip(Integer.parseInt(request.getParameter("ZIP")));
            user.setMail(request.getParameter("mail"));
            user.setPhone(Integer.parseInt(request.getParameter("phone")));
            return user;
        }
        else
            return null;

    }
    public boolean checkInformation(HttpServletRequest request){
        checkPseudo(request);
        checkPassword(request);
        checkPhone(request);
        checkMail(request);
        checkZIP(request);
        checkSex(request);
        checkName(request);
        checkFirstname(request);
        checkAddress(request);
        return result;
    }

    private void checkSex(HttpServletRequest request) {
        if(request.getParameter("sex") == null){
            System.out.println("sex");
            result = false;
        }

    }

    private void checkName(HttpServletRequest request) {
        if (request.getParameter("name") == null) {
            System.out.println("name");
            result = false;
        }
    }

    private void checkFirstname(HttpServletRequest request) {
        if (request.getParameter("firstname") == null) {
            System.out.println("firstname");
            result = false;
        }
    }

    private void checkAddress(HttpServletRequest request) {
        if(request.getParameter("address") == null){
            System.out.println("address");
            result = false;
        }
    }

    public void checkPseudo(HttpServletRequest request){
        String pseudo = request.getParameter("pseudo");
        /* vérifié si pseudo n'est pas déjà pris */
        if(pseudo.equals("master")){
            System.out.println("pseudo");
            result = false;
        }
    }
    public void checkMail(HttpServletRequest request){
        String mail = request.getParameter("mail");
        String mail2 = request.getParameter("mail2");
        /* Ici a voir apparemment dans la balise <imput type="mail" > vérifie lui meme la syntaxe*/
        String regularExpression ="([a-zA-Z0-9 ]*)"+"@"+"([a-zA-Z0-9 ]*)"+"."+"([a-zA-Z0-9 ]*)";
        if(!mail.matches(regularExpression)){
            System.out.println("mail.regularExpression");
            result = false;
        }
            /* Vérification si les deux mails sont exact */
        if(!mail.equals(mail2)){
            System.out.println("mail.equals");
            result = false;
        }
    }
    public void checkPassword(HttpServletRequest request){
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        /* Vérification si les deux mails sont exact */
        if(!password.equals(password2)){
            System.out.println("password.equals");
            result = false;
        }
    }
    public void checkPhone(HttpServletRequest request){
        String phone = request.getParameter("phone");
        String regularExpression ="([0-9]*)";
        if(!phone.matches(regularExpression) || !(phone.length() == 10)){
            System.out.println("phone");
            result = false;
        }
    }

    public void checkZIP(HttpServletRequest request){
        String ZIP = request.getParameter("ZIP");
        String regularExpression ="([0-9]*)";
        if(!ZIP.matches(regularExpression) || !(ZIP.length() == 5)){
            System.out.println("ZIP");
            result = false;
        }
    }
    /*
    public void checkBirth(HttpServletRequest request){
        String birth = request.getParameter("birth");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = simpleDateFormat.parse(birth);
            Calendar calendar = Calendar.getInstance();*/
            /* vérification si la personne est agé de +16 ans*/
           /* calendar.add(Calendar.YEAR, -16);
            if(calendar.getTime().compareTo(date)>=0)
                result=true;

        }catch (ParseException e){
            System.out.println("erreur de date");
        }
    }*/

}
