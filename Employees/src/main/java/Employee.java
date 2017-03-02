import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by kumaraswamyDR on 02/03/17.
 */

@Entity
public class Employee
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;

    private String empName;
    private String empEmailId;
    private String empCategory;
    private String empJoiningDate;


    public Employee(int empId, String empName, String empEmailId, String empCategory, String empJoiningDate) {
        this.empId = empId;
        this.empName = empName;
        this.empEmailId = empEmailId;
        this.empCategory = empCategory;
        this.empJoiningDate = empJoiningDate;
    }

    public Employee(){}

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmailId() {
        return empEmailId;
    }

    public void setEmpEmailId(String empEmailId) {
        this.empEmailId = empEmailId;
    }

    public String getEmpCategory() {
        return empCategory;
    }

    public void setEmpCategory(String empCategory) {
        this.empCategory = empCategory;
    }

    public String getEmpJoiningDate() {
        return empJoiningDate;
    }

    public void setEmpJoiningDate(String empJoiningDate) {
        this.empJoiningDate = empJoiningDate;
    }
}
