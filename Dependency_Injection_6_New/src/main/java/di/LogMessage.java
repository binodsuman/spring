package di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class LogMessage implements ILogMessage {
	
	   private String message = "Spring is super easy";
	
	   

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void getMessage(){
	      System.out.println("Log Message : " + message);
	   }
	   
	}
