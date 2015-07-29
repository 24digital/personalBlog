package controller;

import model.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 24digital on 7/26/15.
 */
@Controller
public class Home {
    private BlogRepository repository;

    @Autowired
    public Home(BlogRepository repository)
    {
        this.repository = repository;

    }
    @RequestMapping("/")
    public String home(Model model)
    {

     model.addAttribute("posts",repository.findPost(5,2));
        return "index";
    }


}
