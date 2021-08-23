package mvc_test_7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


public class DemoController {

	
	 
	
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, 
			defaultValue = "World") String name) {
 
		ModelAndView mv = new ModelAndView("demo");
		
		return mv;
	}
}	

