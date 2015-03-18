package pojo;
// Generated Mar 17, 2015 7:23:33 PM by Hibernate Tools 4.3.1



/**
 * RequestDeliveryId generated by hbm2java
 */
public class RequestDeliveryId  implements java.io.Serializable {


     private int accountId;
     private int studentId;
     private int qileveryQueueId;

    public RequestDeliveryId() {
    }

    public RequestDeliveryId(int accountId, int studentId, int qileveryQueueId) {
       this.accountId = accountId;
       this.studentId = studentId;
       this.qileveryQueueId = qileveryQueueId;
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
    public int getQileveryQueueId() {
        return this.qileveryQueueId;
    }
    
    public void setQileveryQueueId(int qileveryQueueId) {
        this.qileveryQueueId = qileveryQueueId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RequestDeliveryId) ) return false;
		 RequestDeliveryId castOther = ( RequestDeliveryId ) other; 
         
		 return (this.getAccountId()==castOther.getAccountId())
 && (this.getStudentId()==castOther.getStudentId())
 && (this.getQileveryQueueId()==castOther.getQileveryQueueId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAccountId();
         result = 37 * result + this.getStudentId();
         result = 37 * result + this.getQileveryQueueId();
         return result;
   }   


}

