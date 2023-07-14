
package prt.springbootthymeleafcrudwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import prt.springbootthymeleafcrudwebapp.model.Assignment;
import prt.springbootthymeleafcrudwebapp.service.AssignmentService;


@Controller
public class AssignmentController {
    
    @Autowired
    private AssignmentService assignmentService;
    //Create method handler which will display a list of employees for home page index.html to display
    @GetMapping("/index")
    public String viewHomePage (Model model){
        model.addAttribute("listAssignments", assignmentService.getAllAssignments());
        return "index";
    }
    
    @GetMapping("/showNewAssignmentForm")
    public String showNewAssignmentForm(Model model){
        //Create a model to bind new employee data
       Assignment assignment = new Assignment();
       model.addAttribute("assignment", assignment);
       return "new_assignment";
    }
    
    @PostMapping("/saveAssignment")
    public String saveAssignment(@ModelAttribute("assignment")Assignment assignment){
    //save employee tp database
    assignmentService.saveAssignment(assignment);
    return "redirect:/index";
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") long id, Model model){
    //Get the employee from the service
    Assignment assignment = assignmentService.getAssignmentById(id);
    
    //set employee as a model attribute to pre-populate th form
    model.addAttribute("assignment", assignment);
    return "update_assignment";
    }
    
    //delete employee by id
    @GetMapping("/deleteAssignment/{id}")
    public String deleteAssignment(@PathVariable( value = "id") long id){
    
    //Call delete method from the service
    this.assignmentService.deleteAssignmentById(id);
        return "redirect:/index";
    }
}


