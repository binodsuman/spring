package di;

import org.springframework.stereotype.Component;


public class LogMessage2 {
	
	   private String message = "Spring is super easy, use annotiation";

	   public LogMessage2(String message){
	      this.message = message;
	   }
	   
	   public void getMessage(){
	      System.out.println("Log Message : " + message);
	   }
	   
	}
