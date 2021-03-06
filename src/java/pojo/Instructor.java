package pojo;
// Generated Mar 17, 2015 7:23:33 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Instructor generated by hbm2java
 */
public class Instructor  implements java.io.Serializable {


     private InstructorId id;
     private String fulName;
     private int userName;
     private String password;
     private boolean accountType;
     private Set labs = new HashSet(0);
     private Set accounts = new HashSet(0);

    public Instructor() {
    }

	
    public Instructor(InstructorId id, int userName, String password, boolean accountType) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
    }
    public Instructor(InstructorId id, String fulName, int userName, String password, boolean accountType, Set labs, Set accounts) {
       this.id = id;
       this.fulName = fulName;
       this.userName = userName;
       this.password = password;
       this.accountType = accountType;
       this.labs = labs;
       this.accounts = accounts;
    }
   
    public InstructorId getId() {
        return this.id;
    }
    
    public void setId(InstructorId id) {
        this.id = id;
    }
    public String getFulName() {
        return this.fulName;
    }
    
    public void setFulName(String fulName) {
        this.fulName = fulName;
    }
    public int getUserName() {
        return this.userName;
    }
    
    public void setUserName(int userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(boolean accountType) {
        this.accountType = accountType;
    }
    public Set getLabs() {
        return this.labs;
    }
    
    public void setLabs(Set labs) {
        this.labs = labs;
    }
    public Set getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(Set accounts) {
        this.accounts = accounts;
    }




}


