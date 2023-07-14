
package prt.springbootthymeleafcrudwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prt.springbootthymeleafcrudwebapp.model.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long>{
    
}
