delete from [role];
SET IDENTITY_INSERT [Role] ON;
INSERT INTO [Role](RoleID,RoleName) VALUES (1,'Administrator');
INSERT INTO [Role](RoleID,RoleName) VALUES (2,'User');
INSERT INTO [Role](RoleID,RoleName) VALUES (3,'Trainer');
INSERT INTO [Role](RoleID,RoleName) VALUES (4,'Manager');
SET IDENTITY_INSERT [Role] Off;
