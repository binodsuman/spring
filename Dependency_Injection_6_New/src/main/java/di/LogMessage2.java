package di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



public class LogMessage2 implements ILogMessage{
	
	   private String message = "Spring is super easy from SECOND CLASS";

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void getMessage(){
	      System.out.println("Log Message : " + message);
	   }
	   
	}
