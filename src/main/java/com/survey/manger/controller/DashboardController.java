package com.survey.manger.controller;

import com.survey.manger.dao.UserDao;
import com.survey.manger.dto.User;
import com.survey.manger.twilio.TwilioHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="/")
    public String dashboard(){

        return "dashboard";
    }
    @RequestMapping(value="/survey")
    public String register(){
        System.out.println("123Passs ....");
        return "register";
    }
    @PostMapping("/saveSurvey")
    public String saveSurvey(@RequestParam String userName , @RequestParam String mobileNumber){

        User user = new User();
        user.setUserName(userName);
        user.setPhoneNumber(Long.parseLong(mobileNumber));
        userDao.save(user);
        System.out.println("Save Success");
        return "dashboard";
    }

    @PostMapping("/verifyOtp")
    public @ResponseBody String verifyOtp(@RequestParam String userName , @RequestParam String mobileNumber){
        String otp = generateOTP();
        System.out.println(otp);
        String message = "Hi "+userName+"Welcome to Survey Manager. Please note the OTP "+otp+". Don't Share it to any one.";
        TwilioHelper.sent(mobileNumber,message);
        return otp;
    }


    public static String generateOTP() {
        int randomPin   =(int)(Math.random()*9000)+1000;
        String otp  =String.valueOf(randomPin);
        return otp;
    }

    @GetMapping("/getAllUser")
    public String getAllUser(Model model){
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("users", userDao.findAll());
        return "viewUsers.html";

    }

}
