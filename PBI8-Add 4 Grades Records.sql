DELETE FROM EmployeeGrade;
SET IDENTITY_INSERT EmployeeGrade ON;
INSERT INTO EmployeeGrade (GradeID,Name) VALUES (1,'JP');
INSERT INTO EmployeeGrade (GradeID,Name) VALUES (2,'PG');
INSERT INTO EmployeeGrade (GradeID,Name) VALUES (3,'AP');
INSERT INTO EmployeeGrade (GradeID,Name) VALUES (4,'AN');
SET IDENTITY_INSERT EmployeeGrade OFF;

