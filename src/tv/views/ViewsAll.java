package tv.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ViewsAll {
	
	@RequestMapping(value = "home")
    public String home() {
        return "index";
    }
	@RequestMapping(value = "about")
    public String about() {
        return "about";
    }
	@RequestMapping(value = "travel")
    public String travel() {
        return "travel";
    }
	@RequestMapping(value = "contact")
    public String contact() {
        return "contact";
    }

}
