package pojo;
// Generated Mar 17, 2015 7:23:33 PM by Hibernate Tools 4.3.1



/**
 * StudentId generated by hbm2java
 */
public class StudentId  implements java.io.Serializable {


     private int accountId;
     private int studentId;

    public StudentId() {
    }

    public StudentId(int accountId, int studentId) {
       this.accountId = accountId;
       this.studentId = studentId;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StudentId) ) return false;
		 StudentId castOther = ( StudentId ) other; 
         
		 return (this.getAccountId()==castOther.getAccountId())
 && (this.getStudentId()==castOther.getStudentId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAccountId();
         result = 37 * result + this.getStudentId();
         return result;
   }   


}


