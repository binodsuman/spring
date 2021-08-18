package di;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LogMessage2 implements InitializingBean, DisposableBean{
	
	   private String message;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void getMessage(){
	      
	   }
	   //public void init(){
	      //System.out.println("Log Bean is going through init method.");
	   //}
	   public void destroy() {
	      
	   }
	   
	   // This is your init method.
	   public void afterPropertiesSet() throws Exception {
		  
	   }
	}
