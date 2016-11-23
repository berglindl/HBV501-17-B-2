package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    // Request mapping is the path that you want to map this method to
    // In this case, the mapping is the root "/", so when the project
    // is running and you enter "localhost:8080" into a browser, this
    // method is called
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){

        // The string "Index" that is returned here is the name of the view
        // (the Index.jsp file) that is in the path /main/webapp/WEB-INF/jsp/
        // If you change "Index" to something else, be sure you have a .jsp
        // file that has the same name
        return "Login";
    }
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String index(){

        return "Index";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexs(){

        return "Index";
    }

    // To call this method, enter "localhost:8080/user" into a browser
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user(Model model){

        // Here we will show how to add attributes to a model and send it to the view

        // Some attributes for the user
        String fname = "John";
        String lname = "Doe";
        String email = "jod11@hi.is";
        String course = "Computer science";

        // Now let's add the attributes to the model
        model.addAttribute("fname", fname);
        model.addAttribute("lname", lname);
        model.addAttribute("email", email);
        model.addAttribute("course", course);

        // By adding attributes to the model, we can pass information from the controller
        // to the view (the .jsp file).
        return "User";
    }

    //Just to access the calendar...
    @RequestMapping(value ="/calendar", method = RequestMethod.GET)
    public String calendar(){
        return "Calendar";
    }
}
