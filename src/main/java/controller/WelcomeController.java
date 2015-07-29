package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Marion on 7/29/2015.
 */
@Controller
public class WelcomeController {
    @RequestMapping(value = "/welcome/{userId}" ,method = RequestMethod.GET)
    public String welcome(@PathVariable int userId,Model model)
    {
        model.addAttribute("userid",userId);
        return "welcome";
    }

    @RequestMapping(value = "/welcome")
    public String blank()
    {
        return "welcome";
    }
}
