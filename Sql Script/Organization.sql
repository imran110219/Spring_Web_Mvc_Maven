CREATE TABLE ORGANIZATION (
    organizationId int IDENTITY(1,1) PRIMARY KEY,
    organizatioName varchar(80) NOT NULL,
    id int FOREIGN KEY REFERENCES EMPLOYEE(id)
);