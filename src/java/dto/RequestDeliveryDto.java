package dto;
// Generated Mar 15, 2015 10:17:48 PM by Hibernate Tools 4.3.1

import pojo.*;
// Generated Mar 15, 2015 10:17:48 PM by Hibernate Tools 4.3.1



/**
 * RequestDeliveryDto generated by hbm2java
 */
public class RequestDeliveryDto  implements Dto {


     private RequestDeliveryIdDto id;
     private DileveryQueueDto dileveryQueue;
     private StudentDto student;
     private Integer numberOfRequests;
     private String labName;

    public RequestDeliveryDto() {
    }

	
    public RequestDeliveryDto(RequestDeliveryIdDto id, DileveryQueueDto dileveryQueue, StudentDto student, String labName) {
        this.id = id;
        this.dileveryQueue = dileveryQueue;
        this.student = student;
        this.labName = labName;
    }
    public RequestDeliveryDto(RequestDeliveryIdDto id, DileveryQueueDto dileveryQueue, StudentDto student, Integer numberOfRequests, String labName) {
       this.id = id;
       this.dileveryQueue = dileveryQueue;
       this.student = student;
       this.numberOfRequests = numberOfRequests;
       this.labName = labName;
    }
   
    public RequestDeliveryIdDto getId() {
        return this.id;
    }
    
    public void setId(RequestDeliveryIdDto id) {
        this.id = id;
    }
    public DileveryQueueDto getDileveryQueue() {
        return this.dileveryQueue;
    }
    
    public void setDileveryQueue(DileveryQueueDto dileveryQueue) {
        this.dileveryQueue = dileveryQueue;
    }
    public StudentDto getStudent() {
        return this.student;
    }
    
    public void setStudent(StudentDto student) {
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

