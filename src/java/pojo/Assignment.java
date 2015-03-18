package pojo;
// Generated Mar 17, 2015 7:23:33 PM by Hibernate Tools 4.3.1



/**
 * Assignment generated by hbm2java
 */
public class Assignment  implements java.io.Serializable {


     private int assignmentId;
     private Lab lab;
     private Student student;
     private String name;
     private String url;

    public Assignment() {
    }

	
    public Assignment( Lab lab, Student student) {
        
        this.lab = lab;
        this.student = student;
    }
    public Assignment( Lab lab, Student student, String name, String url) {
      
       this.lab = lab;
       this.student = student;
       this.name = name;
       this.url = url;
    }
   
    public int getAssignmentId() {
        return this.assignmentId;
    }
    
    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }
    public Lab getLab() {
        return this.lab;
    }
    
    public void setLab(Lab lab) {
        this.lab = lab;
    }
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }




}


