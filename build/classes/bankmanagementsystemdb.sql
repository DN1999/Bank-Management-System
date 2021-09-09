create table admin
(
    id int(20) primary key,
    name varchar(50),
    email varchar(30),
    password varchar(20)
);

create table Employee
(
    eid int(20) primary key,
    fname varchar(50),
    lname varchar(50),
    email varchar(30),
    phoneno varchar(10),
    state varchar(20), 
    message varchar(30),
    status varchar(20)
);

create table createcustomer
(
    customerid int(20) not null auto_increment,
    ahname varchar(50),
    dob varchar(20),
    age varchar(3),
    gender varchar(10),
    email varchar(30),
    contactno varchar(10),
    userid varchar(15),
    password varchar(15),
    nomineename varchar(30),
    state varchar(20), 
    country varchar(20),
    accounttype varchar(15),    
    panno varchar(15),
    adharno varchar(16),
    peraddress varchar(100),
    tempaddress varchar(100),   
    primary key(customerid,userid)
);

create table createemployee
(
    employeeid int(20) not null auto_increment,
    ename varchar(50),
    dob varchar(20),
    age varchar(3),
    gender varchar(10),
    email varchar(30),
    contactno varchar(10),
    userid varchar(15),
    password varchar(15),
    state varchar(20), 
    country varchar(20),
    position varchar(15),    
    panno varchar(15),
    adharno varchar(16),
    peraddress varchar(100),
    tempaddress varchar(100),   
    primary key(employeeid,userid)
);

create table customer
(
    accountno int(20) not null auto_increment,
    ahname varchar(50),
    dob varchar(20),
    age varchar(3),
    gender varchar(10),
    email varchar(30),
    contactno varchar(10),
    nomineename varchar(30),
    state varchar(20), 
    country varchar(20),
    accounttype varchar(15),    
    panno varchar(15),
    adharno varchar(16),
    peraddress varchar(100),
    tempaddress varchar(100),   
    primary key(accountno)
);

create table Transaction
(
    transactionno int(20) not null auto_increment,
    tdate varchar(20),
    ttime varchar(10),
    accounttype varchar(15),    
    
    depositeaccno varchar(20),
    withdrawaccno varchar(20),
    transferfrom varchar(20),
    transferTo varchar(20),
    ahname varchar(50),
        
    credit varchar(20),
    debit varchar(20),
    Balance varchar(20),   
 primary key(transactionno)
);
