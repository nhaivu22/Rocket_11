-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DELIMITER $$
CREATE PROCEDURE procedure_name (IN pr_departmentname varchar(50))
BEGIN
	SELECT A.Email,A.Username,A.CreateDate
    FROM `account`A
    JOIN department D ON A. DepartmentID=D.DepartmentID
    WHERE DepartmentName=pr_departmentname;
END $$
DELIMITER ;


-- Question 2:  Tạo store để in ra số lượng account trong mỗi group

DELIMITER $$
CREATE PROCEDURE procedure_accounr (IN pr_group TINYINT UNSIGNED)
BEGIN
	SELECT GroupID,AccountID
    FROM   groupaccount
    WHERE GroupID= pr_group
    GROUP BY GroupID;
   
END $$
DELIMITER ;

--   question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo  trong tháng hiện tạ

DELIMITER $$
CREATE PROCEDURE procefure_type_question()
BEGIN

	SELECT		COUNT(TypeID)
    FROM		Question
    WHERE		MONTH(CreateDate) = Month(NOW());
	
END$$
DELIMITER ;