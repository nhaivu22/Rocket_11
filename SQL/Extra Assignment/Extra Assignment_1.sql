drop database if exists Myfresher;
CREATE DATABASE Myfresher;
use Myfresher;
DROP TABLE Design;
-- Tạo table
CREATE TABLE Trainee (
TraineeID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Full_Name VARCHAR(50) NOT NULL,
Birth_Date DATE NOT NULL,
Gender ENUM("male", "female",  "unknown") NOT NULL,
ET_IQ TINYINT UNSIGNED check (ET_IQ <=20),
ET_Gmath TINYINT UNSIGNED check (ET_Gmath <=20),
ET_English TINYINT UNSIGNED check (ET_English <=50),
Training_Class VARCHAR(50),
Evaluation_Notes VARCHAR(100)
);

-- Question 2: thêm trường VTI_Account với điều kiện not null & unique

ALTER TABLE Trainee 
ADD COLUMN VTI_Account SMALLINT UNSIGNED UNIQUE NOT NULL;

-- Exercise 2: Data Types
drop database if exists Data_Types;
CREATE DATABASE Data_Types;
use Data_Types;
CREATE TABLE `data`(
ID MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY NOT NULL,
`Name` VARCHAR(50) NOT NULL,
`Code` CHAR(5) UNIQUE NOT NULL,
ModifiedDate DATETIME
);
 
 -- Exercise 3: Data Types (2)
 drop database if exists Data_Typess;
CREATE DATABASE Data_Typess;
use Data_Typess;
CREATE TABLE daty(
ID MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY NOT NULL,
`Name` CHAR(50) NOT NULL,
BirthDate  TIMESTAMP
);
