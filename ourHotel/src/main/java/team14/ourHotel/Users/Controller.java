package team14.ourHotel.Users;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Controller {

    @RequestMapping(path="/welcome")
    public String getWelcomePage(){
        return "login.html";
    }

    @RequestMapping("/welcome1")
    public ModelAndView getWelcomePageAsModel() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }

    @RequestMapping(path="/welcome2")
    public String thisFails(){
        return "login";
    }
}
