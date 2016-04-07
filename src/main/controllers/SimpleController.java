package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class SimpleController {

    @RequestMapping("admin/welcome")
    public ModelAndView helloWorld(HttpServletRequest request) {
        Principal activeUser = request.getUserPrincipal();
        String username = activeUser.getName();
        String message = "<br><div style='text-align:center;'>"+
                "<h3>**********Hello "+username+"**********</h3></div>"+
                "<br><br>";
        return new ModelAndView("admin/welcome", "message", message);
    }

}
