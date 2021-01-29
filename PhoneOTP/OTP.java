/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
//import java.util.Random;
//import javax.swing.JOptionPane;

/**
 *
 * @author Suraj
 */
public class OTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try {
			// Construct data
                        //apikey="BrA1F+KgM4Q-TNdL94dgYoy7UJhv7fMEblJH06SlFh";
			String apiKey = "apikey=" + "BrA1F+KgM4Q-TNdL94dgYoy7UJhv7fMEblJH06SlFh";
                      // Random rander=new Random();
                        String message = "&message=" + "Hey Shubham Your OTP is ";
			//String message = "&message=" + txtmessage.getText();
			//String sender = "&sender=" + txtSender.getText();
			String numbers = "&numbers=" + "8070643033";
                        //String number= textPhone.getText();
			//otp=rander.nextInt(999999);
                        //String name= textName.getText();
                        
			// Send data
			//HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
                       HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
			String data = apiKey + numbers + message;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
                              //  JOptionPane.showMessageDialog(null," message"+line);
			}
                        System.out.println(stringBuffer.toString());
			
			rd.close();
			//JOptionPane.showConfirmDialog(null, "OTP Send Succssfully ");
                                //return stringBuffer.toString();
		} catch (Exception e) {
			//System.out.println("Error SMS "+e);
                        //JOptionPane.showMessageDialog(null,"Error sms"+e);
                      //  JOptionPane.showMessageDialog(null, "error"+e);
			//return "Error "+e;
                     System.out.println("Error SMS "+e);
		}
      /*  int otp=0;
        try {
			// Construct data
			String apiKey = "apikey=" + "BrA1F+KgM4Q-PI5rF6KWh5cxOSGkXrb3eENnebs2WF";
                        //Random rander=new Random();
			String message = "&message=" + "Hey Shubham Your OTP is ";
			//String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + "8070643033" ;
                        //String number= textPhone.getText();
			//otp=rander.nextInt(999999);
                      //  String name= "Shubham";
                        
                        
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
                        
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
                            
				stringBuffer.append(line);
			}
                        System.out.println(stringBuffer.toString());
			rd.close();
			//JOptionPane.showConfirmDialog(null, "OTP Send Succssfully");
                                //return stringBuffer.toString();
		} catch (Exception e) {
                    System.out.println("Error SMS "+e);
                     //   JOptionPane.showMessageDialog(null,"Error sms"+e);
                      //  JOptionPane.showMessageDialog(null, "error"+e);
			//return "Error "+e;
		}   */     
    }                         
    }
    

