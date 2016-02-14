package onetomanymapping;

import dto.Department;
import dto.Employee;
import myconfig.connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToManyMapping {

    public static void main(String[] args) {
        //to insert data 
        SessionFactory sf = connection.getSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Department d = new Department(2, "Developer");
        s.save(d);
        Employee e = new Employee(101, "Parul", "Developer", 100000);
        e.setD(d);
        s.save(e);
        t.commit();
        s.close();
        sf.close();
    }
    
}
