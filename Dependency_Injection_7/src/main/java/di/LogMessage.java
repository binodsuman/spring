package di;

import org.springframework.stereotype.Component;


public class LogMessage {
	
	   private String message = "Spring is super easy, use annotiation";

	   
	   public void getMessage(){
	      System.out.println("Log Message : " + message);
	   }
	   
	}
