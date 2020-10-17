package com.survey.manger.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class TwilioHelper {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "AC191c2a2cf94bcdae64991ad3ddf73d2a";
  public static final String AUTH_TOKEN = "aa274bff1f34fb6982522cf8e42a623b";

  public static void sent(String mobileNumber, String msgBody) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

  //  Message message = Message.creator(new PhoneNumber("+91"+mobileNumber), new PhoneNumber("+16502624793"), msgBody).create();

   // System.out.println(message.getSid());
    System.out.println("OTP Sent successfully. :)");
  }
}