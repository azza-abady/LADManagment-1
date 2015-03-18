package pojo;
// Generated Mar 17, 2015 7:23:33 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lab generated by hbm2java
 */
public class Lab  implements java.io.Serializable {


     private int labId;
     private Course course;
     private Date startDate;
     private Date endDate;
     private Set instructors = new HashSet(0);
     private Set assignments = new HashSet(0);

    public Lab() {
    }

	
    public Lab(int labId, Course course) {
        this.labId = labId;
        this.course = course;
    }
    public Lab(int labId, Course course, Date startDate, Date endDate, Set instructors, Set assignments) {
       this.labId = labId;
       this.course = course;
       this.startDate = startDate;
       this.endDate = endDate;
       this.instructors = instructors;
       this.assignments = assignments;
    }
   
    public int getLabId() {
        return this.labId;
    }
    
    public void setLabId(int labId) {
        this.labId = labId;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Set getInstructors() {
        return this.instructors;
    }
    
    public void setInstructors(Set instructors) {
        this.instructors = instructors;
    }
    public Set getAssignments() {
        return this.assignments;
    }
    
    public void setAssignments(Set assignments) {
        this.assignments = assignments;
    }




}


