DELETE FROM employee;
dbcc checkident (employee, reseed, 1)