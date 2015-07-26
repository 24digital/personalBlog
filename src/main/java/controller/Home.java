package controller;

import model.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 24digital on 7/26/15.
 */
@Controller
public class Home {
    private BlogRepository repository;
    @Autowired
    public void setRepository(BlogRepository repositor)
    {

    }
    @RequestMapping("/")
    public String home(Model model)
    {
     model.addAttribute("Marion","message");
        return "index";
    }

    @RequestMapping("/t")
    public String homes()
    {
        return "index";
    }
}
