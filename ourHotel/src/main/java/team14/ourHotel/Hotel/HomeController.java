package team14.ourHotel.Hotel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
    @RequestMapping(value="/",method=RequestMethod.GET)
    public ModelAndView viewHomePage(Model model){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
