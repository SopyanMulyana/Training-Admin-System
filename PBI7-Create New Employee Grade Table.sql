IF OBJECT_ID('dbo.EmployeeGrade', 'U') IS NOT NULL 
  DROP TABLE dbo.EmployeeGrade; 

CREATE TABLE EmployeeGrade
( 
  GradeID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  Name VARCHAR(70) NOT NULL
);

