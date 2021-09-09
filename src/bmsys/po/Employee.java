/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmsys.po;

/**
 *
 * @author राधे~राधे !
 */
public class Employee {

    private String employee_Id;
    private String employee_name;
    private String dob;
    private String age;
    private String position;
    private String contactno;
    private String userid;
    private String password;
    private String confirmpassword;
    private String email;
    private String gender;
    private String adharno;
    private String pan;
    private String per_address;
    private String temp_address;
    private String state;
    private String country;
    
 public String getEmployeeId(){
    return employee_Id; 
 }
 public void setEmployeeId(String employee_Id) {
        this.employee_Id = employee_Id;
    }

    public String getEmployeeName(){
    return employee_name; 
 }
 public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

 public String getDob() {
        return dob;
    }
public void setDob(String dob) {
        this.dob = dob;
    }

 public String getAge() {
        return age;
    }
public void setAge(String age) {
        this.age = age;
}

 public String getPosition() {
        return position;
    }
public void setPosition(String position) {
        this.position = position;
}

public String getContactno() {
        return contactno;
    }
public void setContactno(String contactno) {
        this.contactno =contactno ;
}

public String getUserId() {
        return userid;
    }
public void setUserId(String userid) {
        this.userid =userid ;
}
public String getPassword() {
        return password;
    }
public void setPassword(String password) {
        this.password = password;
}
public String getConfirmPassword() {
        return confirmpassword;
    }
public void setConfirmPassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
}

public String getEmail() {
        return email;
    }
public void setEmail(String email) {
        this.email = email;
}

public String getGender(){
    return gender;
}
public void setGender(String gender){
 this.gender=gender;
}
public String getPanNo() {
        return pan;
    }
public void setPanNo(String pan) {
        this.pan = pan;
}

public String getAdharNo() {
        return adharno;
    }
public void setAdharNo(String adharno) {
        this.adharno = adharno;
}
public String getPerAddress() {
        return per_address;
    }
public void setPerAddress(String per_address) {
        this.per_address =per_address ;
}

public String getTempAddress() {
        return temp_address;
    }
public void setTempAddress(String temp_address) {
        this.temp_address =temp_address ;
}
 
public String getState(){
        return state;
    }
public void setState(String state){
    this.state=state;
}

public String getCountry(){
        return country;
    }
public void setCountry(String country){
    this.country = country;
}
}
