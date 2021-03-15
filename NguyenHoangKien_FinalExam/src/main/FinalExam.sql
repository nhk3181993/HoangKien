drop database if exists FinalExam;
create database FinalExam;
USE FinalExam;

DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
	ID INT PRIMARY KEY,
    fullName VARCHAR(50),
    email VARCHAR(50),
    `password` VARCHAR(50)
);

DROP TABLE IF EXISTS Manager;
CREATE TABLE Manager (
	ID INT,
    ExpInYear INT,
    FOREIGN KEY (ID) REFERENCES `User`(ID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS Project;
CREATE TABLE Project (
	projectID INT PRIMARY KEY,
    teamSize INT,
    idManager INT,
    FOREIGN KEY (idManager) REFERENCES Manager(ID)
);

DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
	ID INT,
    projectID INT,
    proSkill VARCHAR(100),
    FOREIGN KEY (projectID) REFERENCES Project(projectID) ON DELETE CASCADE,
    FOREIGN KEY (ID) REFERENCES `User`(ID) ON DELETE CASCADE
);

-- INSERT
INSERT INTO `User`
VALUES	(1, 'Nguyen Van A',	'nguyenvana@gmail.com',	'Abc123'),
		(2, 'Nguyen Van B',	'nguyenvanb@gmail.com',	'Abc123'),
        (3, 'Tran Thi C',	'tranthic@gmail.com',	'Abc123'),
        (4, 'Le Van D',		'levand@gmail.com',		'123Abc'),
		(5, 'Tran Van E',	'tranvane@gmail.com',	'123Abc'),
		(6, 'Ta Hong F',	'tahongf@gmail.com',	'123Abc'),
        (7, 'Phung Hai G',	'phunghaig@gmail.com',	'123Abc');

INSERT INTO Manager
VALUES	(1, 3),
		(2, 2),
        (3, 4);
        
INSERT INTO Project
VALUES	(10, 2, 1),
		(11, 3, 2),
        (12, 2, 3);

INSERT INTO employee
VALUES	(4,	10, 'dev'),
		(5,	11, 'test'),
		(6,	11, ' java'),
        (7,	12, 'sql');
        
