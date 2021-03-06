package pojo;
// Generated Mar 17, 2015 7:23:33 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department  implements java.io.Serializable {


     private int departmentId;
     private String name;
     private Set students = new HashSet(0);

    public Department() {
    }

	
    public Department(int departmentId) {
        this.departmentId = departmentId;
    }
    public Department(int departmentId, String name, Set students) {
       this.departmentId = departmentId;
       this.name = name;
       this.students = students;
    }
   
    public int getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }




}


