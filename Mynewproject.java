/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynewproject;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karimjan
 */
public class Mynewproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
 
         
    try{
         
      
              String file= "logFile.doc";
              PrintWriter print= new PrintWriter(file);
              print.println("%%%%%%%%%%%%%%%%%%");
    
        Timer timing = new Timer();
        timing.schedule(new TimerTask() {
            

            @Override
            public void run() {
                 LocalDateTime getcurrenttime = LocalDateTime.now();  
                 String dateAndTime=datetimeformat.format(getcurrenttime); 
                try {
                    Random randomnum=new Random();
                    int end =5;
                    for(int loopviriable=0;loopviriable<=end;loopviriable++){
                        int checkSugurLevel=randomnum.nextInt(5);
                        if( checkSugurLevel>=0 && checkSugurLevel<2){
                            System.out.println("Your Sugur Level is low Patient need some Sugar and take Glucose");
                         
                        
                            print.println("Your Sugur Level is low Patient need some Sugar and  take Glucose\n Your Suger Level is: "+checkSugurLevel);
                            print.println(dateAndTime);
                            print.println("\n");
                            print.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            print.println("\n");
                           
                          print.flush();
                            break;
                            
                        }
                        else if( checkSugurLevel>=3 &&  checkSugurLevel<=5){
                            System.out.println("The Patient's sugar level is very high You need to inject insulin:");
                         
                        
                            print.println("The Patient's Suger Level is Very High You need to inject insulin\n Your Suger Level is: "+ checkSugurLevel);
                             print.println(dateAndTime);
                             print.println("\n");
                            print.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                           print.println("\n");
                                print.flush();
                                break;

                     }
                        else if( checkSugurLevel==2){
                            System.out.println("Your Sugur Level is Normal:");
                                                
                            print.println("Your Suger Level is normal\n Your Suger Level is: "+ checkSugurLevel);
                             print.println(dateAndTime);
                             print.println("\n");
                            print.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            print.println("\n");
                             print.flush();

                                break;    
                        }
                    }  
                    System.out.println("Cheking For Your Suger Level.....");
                } catch (Exception ex) {
                    Logger.getLogger(Mynewproject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
       },
     new Date(),
        4000
        );  
    }  
       catch(Exception exp){System.out.println(exp);
           
           }  
}}