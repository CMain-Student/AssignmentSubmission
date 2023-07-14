
package prt.springbootthymeleafcrudwebapp.service;

import java.util.List;
import prt.springbootthymeleafcrudwebapp.model.Assignment;

public interface AssignmentService {
    List<Assignment> getAllAssignments();
    
    //Save employ by passing the Assignment object into the method
    void saveAssignment(Assignment assignment);
    
    //get Assignment by ID
    Assignment getAssignmentById(long id);
    
    void deleteAssignmentById(long id);
}
