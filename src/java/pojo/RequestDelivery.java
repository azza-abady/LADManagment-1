package pojo;
// Generated Mar 17, 2015 7:23:33 PM by Hibernate Tools 4.3.1



/**
 * RequestDelivery generated by hbm2java
 */
public class RequestDelivery  implements java.io.Serializable {


     private RequestDeliveryId id;
     private DileveryQueue dileveryQueue;
     private Student student;
     private Integer numberOfRequests;
     private String labName;

    public RequestDelivery() {
    }

	
    public RequestDelivery(RequestDeliveryId id, DileveryQueue dileveryQueue, Student student, String labName) {
        this.id = id;
        this.dileveryQueue = dileveryQueue;
        this.student = student;
        this.labName = labName;
    }
    public RequestDelivery(RequestDeliveryId id, DileveryQueue dileveryQueue, Student student, Integer numberOfRequests, String labName) {
       this.id = id;
       this.dileveryQueue = dileveryQueue;
       this.student = student;
       this.numberOfRequests = numberOfRequests;
       this.labName = labName;
    }
   
    public RequestDeliveryId getId() {
        return this.id;
    }
    
    public void setId(RequestDeliveryId id) {
        this.id = id;
    }
    public DileveryQueue getDileveryQueue() {
        return this.dileveryQueue;
    }
    
    public void setDileveryQueue(DileveryQueue dileveryQueue) {
        this.dileveryQueue = dileveryQueue;
    }
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    public Integer getNumberOfRequests() {
        return this.numberOfRequests;
    }
    
    public void setNumberOfRequests(Integer numberOfRequests) {
        this.numberOfRequests = numberOfRequests;
    }
    public String getLabName() {
        return this.labName;
    }
    
    public void setLabName(String labName) {
        this.labName = labName;
    }




}


