
package prt.springbootthymeleafcrudwebapp.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prt.springbootthymeleafcrudwebapp.model.Assignment;
import prt.springbootthymeleafcrudwebapp.repository.AssignmentRepository;

@Service
public class AssignmentServiceImpl implements AssignmentService{

    @Autowired
    private AssignmentRepository assignmentRepository;
    @Override
//    Create get all employee method - return a list of employees to the controller
    public List<Assignment> getAllAssignments() {
        
        return assignmentRepository.findAll();
     }

    @Override
    public void saveAssignment(Assignment assignment) {
       this.assignmentRepository.save(assignment);
    }

    @Override
    public Assignment getAssignmentById(long id) {
        Optional<Assignment> optional=assignmentRepository.findById(id);
        Assignment assignment = null;
        if(optional.isPresent()){
            assignment = optional.get();
        }else{
                throw new RuntimeException(" Assignment not found for id:: " + id);
        }
        return assignment;
    }

    @Override
    public void deleteAssignmentById(long id) {
        this.assignmentRepository.deleteById(id);
    }
    
}
