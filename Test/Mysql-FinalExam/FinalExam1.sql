drop database if exists mystudent;
create database mystudent;
use mystudent;

-- tạo bảng 1

CREATE TABLE Country(
country_id 		TINYINT UNSIGNED PRIMARY KEY NOT NULL,
country_name 		VARCHAR(50)  NOT NULL
);

CREATE TABLE Location(
location_id 			TINYINT UNSIGNED PRIMARY KEY NOT NULL,
street_address 			VARCHAR(50)  NOT NULL,
postal_code				VARCHAR(50)  NOT NULL,
country_id				TINYINT UNSIGNED  NOT NULL,
FOREIGN KEY(country_id) REFERENCES Country(country_id)
);

CREATE TABLE Employee(
employee_id 		TINYINT UNSIGNED PRIMARY KEY NOT NULL,
full_name 		VARCHAR(50)  NOT NULL,
email				VARCHAR(50)  NOT NULL,
location_id			TINYINT UNSIGNED NOT NULL,
FOREIGN KEY(location_id) REFERENCES Location(location_id)
);
-- Questions1

-- add data Country
INSERT INTO Country(country_id, country_name)
VALUES				(1,			'Viet Nam'),
					(2,			'Nhat ban'),
                    (3,			'Han Quoc');
                    
                    
                    
-- add data Location
INSERT INTO Location(location_id,	 	street_address,							postal_code,			country_id)
VALUES				(1,					'101 thanh nhan- hai ba trung- ha noi',		'250', 					'1'	),
					(2,					'125-Tokyo-nhat ban',						'650',					'2'),
                    (3,					'222-Seoul- han quoc',						'554',					'3');
		
  -- add data Employee     
INSERT INTO Employee(employee_id,	 	full_name,							email,					location_id)
VALUES				(1,					'Vu thi nhai',						'nhaivu22@gmail.com', 					'1'	),
					(2,					'Dao van ca',						'ca22122@gmail.com',					'2'),
                    (3,					'Tong thi hong',					'honghong@gmail.com',					'3');
                    
	
-- Questions2
-- a) Lấy tất cả các nhân viên thuộc Việt nam
SELECT*
FROM Location L
JOIN Country C ON L.country_id=C.country_id
WHERE C.country_name ='Viet Nam';

-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT*
FROM Employee E
JOIN Location L ON E.location_id= L.location_id
JOIN Country C ON L.country_id=C.country_id
WHERE email =" nn03@gmail.com";

-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.
SELECT*,count(E.employee_id)
FROM Employee E
JOIN Location L ON E.location_id= L.location_id
JOIN Country C ON L.country_id=C.country_id
GROUP BY E.employee_id;

-- 3. Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
DROP TRIGGER IF EXISTS trigger_Employee;
DELIMITER $$
CREATE TRIGGER trigger_Employee
BEFORE INSERT ON trigger_Employee
FOR EACH ROW
BEGIN 
		SELECT*,count(E.employee_id)
				FROM Employee E
				JOIN Location L ON E.location_id= L.location_id
				JOIN Country C ON L.country_id=C.country_id
				GROUP BY E.employee_id
						if new.count(E.employee_id) > 10 then
						SIGNAL SQLSTATE '12345'
						SET MESSAGE_TEXT =" khong duoc inster";
						END IF;
DELIMITER $$
INSERT INTO Employee(employee_id,	 	full_name,							email,							location_id)
VALUES				(5,					'Ta thi vui',						'vuivui@gmail.com', 					'1'	);

