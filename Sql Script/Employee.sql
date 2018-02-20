CREATE TABLE EMPLOYEE(
	id int IDENTITY(1,1) PRIMARY KEY,
	fullName varchar(80) NOT NULL,
    name varchar(50) NOT NULL,
    joining_date DATE NOT NULL,
    salary float NOT NULL,
    ssn varchar(30) NOT NULL UNIQUE,
);