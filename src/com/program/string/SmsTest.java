package com.program.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class SmsTest {

	public static void main(String[] args) {
		SendSmsUtil sms = new SendSmsUtil();
		sms.sendSmsToPassenger("Dayanidhi", "12345", "8147606490");
	}

}
 class SendSmsUtil {
	
	 String username = "oprstrimax";
	 String password = "Trimax@@123";
	 String mtype = "N";
	 String DR = "Y";
	 String sid = "TSRTC";
	 String encoding = "UTF-8";
	public void sendSmsToPassenger(String name,String ticketNo,String phone) {
		try {
			String message = "Dear "+name+",Your TSRTC Bus ticket no :"+ticketNo+" is Booked. Thank you and wish you happy journey";
			String smsgateway ="User="+username+"&passwd="+password+"&mobilenumber="+phone+"&message=" + message
					+"&sid="+sid+"&mtype="+mtype+"&DR="+DR;
			System.out.println("queryString===>" + smsgateway);
			URL url = new URL("http://api.smscountry.com/SMSCwebservice_bulk.aspx?");
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			wr.write(smsgateway);
			wr.flush();
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//String result = rd.readLine();
			String result2 = "";
			String test = "";
			String test2 = "";
			while ((result2 = rd.readLine()) != null) {
				test2 += "|"+result2;
			}			
			wr.close();
			rd.close();
			//System.out.println("response====>>"+result);
			System.out.println("response2====>>"+result2);
			System.out.println("response2====>>"+test2);
			if (result2 == null) {
				System.out.println("--------No response received--------");
			} else {
				System.out.println("--------Message sent successfully-------");
			}
		} catch (Exception e) {
		}
	}
}