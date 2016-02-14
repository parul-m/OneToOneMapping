
package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
    @Id
    int e_id;
    String e_name;
    String e_department;
    float e_salary;

    public Employee() {}
    
    public Employee(int e_id, String e_name, String e_department, float e_salary) {
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_department = e_department;
        this.e_salary = e_salary;
    }
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_dept_id")
    Department d;
    
    public Department getD() {
        return d;
    }

    public void setD(Department d) {
        this.d = d;
    }
    
    public int getId() {
        return e_id;
    }

    public void setId(int e_id) {
        this.e_id = e_id;
    }

    public String getName() {
        return e_name;
    }

    public void setName(String e_name) {
        this.e_name = e_name;
    }

    public String getDepartment() {
        return e_department;
    }

    public void setDepartment(String e_department) {
        this.e_department = e_department;
    }

    public float getSalary() {
        return e_salary;
    }

    public void setSalary(float e_salary) {
        this.e_salary = e_salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + e_id + ", name=" + e_name + '}';
    }
    
    
}
