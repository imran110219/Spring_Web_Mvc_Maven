CREATE TABLE VerificationToken (
    verificationTokenId int  NOT NULL PRIMARY KEY IDENTITY(1,1),
    token varchar(255),
    expiryDate Date,
	EmployeeId int FOREIGN KEY REFERENCES Employee(id)
);