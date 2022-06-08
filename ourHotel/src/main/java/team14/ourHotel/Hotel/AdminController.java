package team14.ourHotel.Hotel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
    @RequestMapping(value="/admin",method=RequestMethod.GET)
    public ModelAndView viewAdminPage(Model model){
        return new ModelAndView("Admin");
    }
}
