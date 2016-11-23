package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Grades;
import project.persistence.repositories.GradesRepository;
import project.service.GradesService;

@Controller
public class GradesController {

    // Instance Variables
    GradesService gradesService;

    // Dependency Injection
    @Autowired
    public GradesController(GradesService gradesService) {
        this.gradesService = gradesService;
    }

    // Method that returns the correct view for the URL /grades
    // This handles the GET request for this URL
    // Notice the `method = RequestMethod.GET` part
    @RequestMapping(value = "/grades", method = RequestMethod.GET)
    public String gradesViewGet(Model model){

        // Add a new Grade to the model for the form
        // If you look at the form in Grades.jsp, you can see that we
        // reference this attribute there by the name `grades`.
        model.addAttribute("grades",new Grades());

        // Here we get all the Grades (in a reverse order) and add them to the model
        model.addAttribute("manyGrades",gradesService.findAllReverseOrder());

        // Return the view
        return "Grades";
    }

    // Method that receives the POST request on the URL /grades
    // and receives the ModelAttribute("grades")
    // That attribute is the attribute that is mapped to the form, so here
    // we can save the grade because we get the data that was entered into the form.
    // Notice the `method = RequestMethod.POST` part
    @RequestMapping(value = "/grades", method = RequestMethod.POST)
    public String gradesViewPost(@ModelAttribute("grades") Grades grades,
                                     Model model){

        // Save the Grade that we received from the form
       gradesService.save(grades);

        // Here we get all the Grades (in a reverse order) and add them to the model
        model.addAttribute("manyGrades", gradesService.findAllReverseOrder());

        // Add a new Grade to the model for the form
        // If you look at the form in Grades.jsp, you can see that we
        // reference this attribute there by the name `grades`.
        model.addAttribute("grades", new Grades());

        // Return the view
        return "Grades";
    }

    // Method that returns the correct view for the URL /grades/{subject}
    // The {subject} part is a Path Variable, and we can reference that in our method
    // parameters as a @PathVariable. This enables us to create dynamic URLs that are
    // based on the data that we have.
    // This method finds all Grades posted by someone with the requested {subject}
    // and returns a list with all those Grades.
    @RequestMapping(value="/grades/{subject}", method = RequestMethod.GET)
    public String getGradesFromSubject(@PathVariable String subject, Model model){
        //Get all grades with this title and add them to the model
        model.addAttribute("manyGrades", gradesService.findBySubject(subject));

        //Add a new grade to the model for the form
        //Is referenced in the form in Grades.jsp via 'grades'
        model.addAttribute("grades", new Grades());
        //Return the view
        return "Grades";
    }
}