package dto;
// Generated Mar 15, 2015 10:17:48 PM by Hibernate Tools 4.3.1

import pojo.*;
// Generated Mar 15, 2015 10:17:48 PM by Hibernate Tools 4.3.1



/**
 * RequestAssesmentIdDto generated by hbm2java
 */
public class RequestAssesmentIdDto  implements Dto {


     private int accountId;
     private int studentId;
     private int assesmentQueueId;

    public RequestAssesmentIdDto() {
    }

    public RequestAssesmentIdDto(int accountId, int studentId, int assesmentQueueId) {
       this.accountId = accountId;
       this.studentId = studentId;
       this.assesmentQueueId = assesmentQueueId;
    }
   
    public int getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getAssesmentQueueId() {
        return this.assesmentQueueId;
    }
    
    public void setAssesmentQueueId(int assesmentQueueId) {
        this.assesmentQueueId = assesmentQueueId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RequestAssesmentIdDto) ) return false;
		 RequestAssesmentIdDto castOther = ( RequestAssesmentIdDto ) other; 
         
		 return (this.getAccountId()==castOther.getAccountId())
 && (this.getStudentId()==castOther.getStudentId())
 && (this.getAssesmentQueueId()==castOther.getAssesmentQueueId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAccountId();
         result = 37 * result + this.getStudentId();
         result = 37 * result + this.getAssesmentQueueId();
         return result;
   }   


}


