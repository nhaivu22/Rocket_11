-- VIEW
    
  --  Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale 
DROP VIEW view_acc;
DROP VIEW view_sale;
CREATE VIEW view_sale
AS
			SELECT AC.Email,AC.FullName, AC.Username
			FROM `account` AC
			JOIN department DE ON AC.DepartmentID=DE.DepartmentID
			WHERE DepartmentName ="sale";
			
            
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
CREATE VIEW view_account 
as
        SELECT *,count(AccountID)
		FROM groupaccount
		GROUP BY AccountID
		HAVING count(AccountID)= (
									SELECT count(AccountID) AS soluong
									FROM groupaccount
									GROUP BY AccountID
									ORDER BY soluong DESC
									LIMIT 1);

-- question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
CREATE VIEW view_content
AS
        SELECT *
		FROM question
		WHERE length(Content) < 300;


-- question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE VIEW view_Department
AS
        SELECT AC.Email,AC.Username, AC.CreateDate,count(AC.DepartmentID)
		FROM `account` AC
		JOIN department DE ON AC.DepartmentID=DE.DepartmentID
		GROUP BY  AC.DepartmentID
		HAVING count(AC.DepartmentID) =
										( SELECT count(AC.DepartmentID) AS soluong
										FROM `account` AC
										GROUP BY  AC.DepartmentID
										ORDER BY soluong DESC
										LIMIT 1);

-- question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
CREATE VIEW view_user 
AS
            SELECT A.Username, A.FullName
			FROM question Q
			JOIN `account` A ON Q.CreatorID =A.AccountID
			WHERE Username LIKE 'nguye%';