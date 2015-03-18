package pojo;
// Generated Mar 17, 2015 7:23:33 PM by Hibernate Tools 4.3.1



/**
 * AccountId generated by hbm2java
 */
public class AccountId  implements java.io.Serializable {


     private int accountId;
     private int studentAccountId;
     private int studentStudentId;
     private int instructorAccountId;
     private int instructorInstructorId;

    public AccountId() {
    }

    public AccountId(int accountId, int studentAccountId, int studentStudentId, int instructorAccountId, int instructorInstructorId) {
       this.accountId = accountId;
       this.studentAccountId = studentAccountId;
       this.studentStudentId = studentStudentId;
       this.instructorAccountId = instructorAccountId;
       this.instructorInstructorId = instructorInstructorId;
    }
   
    public int getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getStudentAccountId() {
        return this.studentAccountId;
    }
    
    public void setStudentAccountId(int studentAccountId) {
        this.studentAccountId = studentAccountId;
    }
    public int getStudentStudentId() {
        return this.studentStudentId;
    }
    
    public void setStudentStudentId(int studentStudentId) {
        this.studentStudentId = studentStudentId;
    }
    public int getInstructorAccountId() {
        return this.instructorAccountId;
    }
    
    public void setInstructorAccountId(int instructorAccountId) {
        this.instructorAccountId = instructorAccountId;
    }
    public int getInstructorInstructorId() {
        return this.instructorInstructorId;
    }
    
    public void setInstructorInstructorId(int instructorInstructorId) {
        this.instructorInstructorId = instructorInstructorId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AccountId) ) return false;
		 AccountId castOther = ( AccountId ) other; 
         
		 return (this.getAccountId()==castOther.getAccountId())
 && (this.getStudentAccountId()==castOther.getStudentAccountId())
 && (this.getStudentStudentId()==castOther.getStudentStudentId())
 && (this.getInstructorAccountId()==castOther.getInstructorAccountId())
 && (this.getInstructorInstructorId()==castOther.getInstructorInstructorId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAccountId();
         result = 37 * result + this.getStudentAccountId();
         result = 37 * result + this.getStudentStudentId();
         result = 37 * result + this.getInstructorAccountId();
         result = 37 * result + this.getInstructorInstructorId();
         return result;
   }   


}


