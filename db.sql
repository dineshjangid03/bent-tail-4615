CREATE DATABASE sb101project ;

USE SB101PROJECT ;

CREATE TABLE department (
id INT PRIMARY KEY AUTO_INCREMENT,
Name VARCHAR(50) UNIQUE NOT NULL
);

insert into department (name) values ('it');

CREATE TABLE employee (
id INT PRIMARY KEY AUTO_INCREMENT,
firstName VARCHAR(25) NOT NULL,
lastName VARCHAR(25) NOT NULL,
mobile VARCHAR(10) UNIQUE NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL,
password VARCHAR(100) NOT NULL,
dateOfBirth DATE NOT NULL,
address VARCHAR(255) NOT NULL,
salary INT NOT NULL,
hireDate DATE NOT NULL,
departmentID INT NOT NULL,
FOREIGN KEY (departmentID) REFERENCES department (id)
);

insert into employee(firstName,lastName,mobile,email,password,dateOfBirth,address,salary,hireDate,departmentID) values('a','a','111111','a@a','pass','2001-01-01','add',5000,'2022-01-01',1);

