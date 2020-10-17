package com.survey.manger.twilio;


import com.sun.el.util.MessageFactory;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.api.v2010.account.Message;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.*;

public class SmsSender {
//    // Find your Account Sid and Auth Token at twilio.com/console
//    public static final String ACCOUNT_SID = "AC191c2a2cf94bcdae64991ad3ddf73d2a";
//    public static final String AUTH_TOKEN = "your_auth_token";
//
//    public static void main(String[] args) {
//        TwilioRestClient client = new TwilioRestClient.Builder(ACCOUNT_SID, AUTH_TOKEN).build();
//
//        // Build the parameters
//        List<NameValuePair> params = new ArrayList<NameValuePair>();
//        params.add(new BasicNameValuePair("To", "+14159352345"));
//        params.add(new BasicNameValuePair("From", "+14158141829"));
//        params.add(new BasicNameValuePair("Body", "Where's Wallace?"));
//
//        Message message = Message.create(params);
//
//        System.out.println(message.getSid());
//    }
}