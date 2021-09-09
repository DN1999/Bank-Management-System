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
public class Customer {
    private String accountno;
    private String acc_holder_name;
    private String dob;
    private String age;
    private String acc_type;
    private String contactno;
    private String userid;
    private String password;
    private String confirmpassword;
    private String nomineename;
    private String email;
    private String gender;
    private String adharno;
    private String pan;
    private String per_address;
    private String temp_address;
    private String state;
    private String country;
    
    
 public String getAccountNo(){
    return accountno; 
 }
 public void setAccountNo(String accountno) {
        this.accountno = accountno;
    }

   public String getAccHolderName(){
    return acc_holder_name; 
 }
 public void setAccHolderName(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
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

 public String getAccType() {
        return acc_type;
    }
public void setAccType(String acc_type) {
        this.acc_type = acc_type;
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
public String getNomineeName() {
        return nomineename;
    }
public void setNomineeName(String nomineename) {
        this.nomineename = nomineename;
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

//Transaction Variable
    private String transactionno;
    private String tdate;
    private String ttime;
    private String accounttype;
    private String depositeaccno;
    private String withdrawaccno;
    private String transferfrom;
    private String transferTo;
    private String credit;
    private String debit;
    private String balance;

public String getTransactionno(){
        return transactionno;
    }
public void setTransactionno(String transactionno){
    this.transactionno = transactionno;
}
 
public String getTdate(){
        return tdate;
    }
public void setTdate(String tdate){
    this.tdate = tdate;
}
 
public String getTtime(){
        return ttime;
    }
public void setTtime(String ttime){
    this.ttime = ttime;
}

public String getAccounttype(){
        return accounttype;
    }
public void setAccounttype(String accounttype){
    this.accounttype = accounttype;
}

public String getDepositeaccno(){
        return depositeaccno;
    }
public void setDepositeaccno(String depositeaccno){
    this.depositeaccno = depositeaccno;
}

public String getWithdrawaccno(){
        return withdrawaccno;
    }
public void setWithdrawaccno(String withdrawaccno){
    this.withdrawaccno = withdrawaccno;
}

public String getTransferfrom(){
        return transferfrom;
    }
public void setTransferfrom(String transferfrom){
    this.transferfrom = transferfrom;
}

public String getTransferTo(){
        return transferTo;
    }
public void setTransferTo(String transferTo){
    this.transferTo = transferTo;
}

public String getCredit(){
        return credit;
    }
public void setCredit(String credit){
    this.credit = credit;
}

public String getDebit(){
        return debit;
    }
public void setDebit(String debit){
    this.debit = debit;
}

public String getBalance(){
        return balance;
    }
public void setBalance(String balance){
    this.balance = balance;
}

}