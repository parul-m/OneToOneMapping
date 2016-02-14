package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    int d_id;
    String d_name;

    public Department() {}
    
    public Department(int d_id, String d_name) {
        this.d_id = d_id;
        this.d_name = d_name;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }
}
