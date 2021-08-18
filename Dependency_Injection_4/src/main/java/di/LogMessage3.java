package di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// Add new depedency

public class LogMessage3 {
	   private String message;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void getMessage(){
	      System.out.println("Log Message : " + message);
	   }
	   
	   
	   public void init(){
	      
	   }
	   
	   
	   public void destroy() {
	      
	   }
	}
