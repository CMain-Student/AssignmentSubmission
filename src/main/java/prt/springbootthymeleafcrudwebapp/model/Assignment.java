
package prt.springbootthymeleafcrudwebapp.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author bblns18
 */
@Entity
@Table(name = "assignment")
public class Assignment implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @Column(name = "name")
    private String Name;
    
    @Column(name = "date_of_submission")
    private String dateOfSubmission;
    
    @Column(name = "module_name")
    private String ModuleName;   

    public long getId() {
        return id;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String moduleName) {
        this.ModuleName = moduleName;
    }

    public String getDateOfSubmission() {
        return dateOfSubmission;
    }

    public void setDateOfSubmission(String DateOfSubmission) {
        this.dateOfSubmission = DateOfSubmission;
    }
    
    
}
