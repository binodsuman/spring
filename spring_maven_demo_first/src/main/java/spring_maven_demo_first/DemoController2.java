package spring_maven_demo_first;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController2 {

	String message = "Hello Second ";
	 
	
	// abc.com   -> Index.jsp
	// abc.com/about -> /WEB-INF/views/demo.jsp
	
	@RequestMapping("/show")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, 
			defaultValue = "World") String name) {
 
		ModelAndView mv = new ModelAndView("show");
		
		return mv;
	}
}
