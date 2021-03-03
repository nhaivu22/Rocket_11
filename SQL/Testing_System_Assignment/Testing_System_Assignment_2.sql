drop database if exists Testing_System;
create database Testing_System;
use Testing_System;

--             Tạo Bảng          ----

-- tạo bảng 1

CREATE TABLE Department(
DepartmentID 		TINYINT UNSIGNED PRIMARY KEY NOT NULL,
DepartmentName 		VARCHAR(50) UNIQUE KEY NOT NULL
);

-- tạo bảng 2

CREATE TABLE 		`Position`(
PositionID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY NOT NULL,
PositionName 		ENUM('Dev', 'Test', 'Scrum Master', 'PM')NOT NULL UNIQUE KEY
);

-- tạo bảng 3

CREATE TABLE 		`Account`(
AccountID 			TINYINT UNSIGNED  AUTO_INCREMENT PRIMARY KEY ,
Email 				VARCHAR(30) UNIQUE KEY NOT NULL,
Username 			VARCHAR(30) UNIQUE KEY NOT NULL,
FullName 			VARCHAR(50)NOT NULL,
DepartmentID 		TINYINT UNSIGNED NOT NULL,
PositionID 			TINYINT UNSIGNED NOT NULL,
CreateDate 			DATETIME DEFAULT NOW(),
FOREIGN KEY(DepartmentID ) REFERENCES Department(DepartmentID),
FOREIGN KEY(PositionID)    REFERENCES `Position`(PositionID)
);

-- tạo bảng 4

CREATE TABLE 		`Group`(
GroupID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL,
GroupName 			VARCHAR(50) NOT NULL,
CreatorID 			TINYINT UNSIGNED NOT NULL,
CreateDate 			DATE,
FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountID)
);

-- tạo bảng 5

CREATE TABLE 		GroupAccount(
GroupID 			TINYINT UNSIGNED NOT NULL,
AccountID 			TINYINT UNSIGNED NOT NULL,
JoinDate 			DATE,
PRIMARY KEY (GroupID, AccountID),
FOREIGN KEY(GroupID) REFERENCES `Group`(GroupID)
);

-- tạo bảng 6

CREATE TABLE 		TypeQuestion(
TypeID 				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL,
TypeName 			ENUM('Essay', 'Multiple-Choice')
);

-- tạo bảng 7

CREATE TABLE 		CategoryQuestion(
CategoryID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
CategoryName 		ENUM('Java', '.NET', 'SQL', 'Postman','Ruby')
);

-- tạo bảng 8

CREATE TABLE 		Question(
QuestionID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL,
Content 			VARCHAR(50) NOT NULL,
CategoryID 			TINYINT UNSIGNED NOT NULL,
TypeID 				TINYINT UNSIGNED NOT NULL,
CreatorID 			TINYINT UNSIGNED NOT NULL,
CreateDate			DATE,
FOREIGN KEY(TypeID) REFERENCES TypeQuestion(TypeID),
FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
FOREIGN KEY(CreatorID) 	REFERENCES `Account`(AccountId)
);

-- tạo bảng 9
CREATE TABLE 		Answer(
AnswerID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL,
Content 			VARCHAr(50),
QuestionID 			TINYINT UNSIGNED NOT NULL,
isCorrect			VARCHAR(50) NOT NULL,
FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID)
);

-- tạo bảng 10

CREATE TABLE 		Exam(
ExamID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
`Code` 				VARCHAR(10) UNIQUE NOT NULL,
Title 				VARCHAR(50),
CategoryID 			TINYINT UNSIGNED NOT NULL,
Duration 			TINYINT UNSIGNED NOT NULL,
CreatorID 			TINYINT UNSIGNED NOT NULL,
CreateDate 			DATE,
FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
FOREIGN KEY(CreatorID) 	REFERENCES `Account`(AccountId)
);

-- tạo bảng 11

CREATE TABLe  ExamQuestion(
ExamID 				TINYINT UNSIGNED  NOT NULL,
QuestionID 			TINYINT UNSIGNED  NOT NULL,
PRIMARY KEY (ExamID,QuestionID),
FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID),
FOREIGN KEY(ExamID) REFERENCES Exam(ExamID) 
);

-- add data Department--
INSERT INTO Department(DepartmentID, DepartmentName)
VALUES				(1,			'Marketing'),
					(2,			'Sale'),
                    (3,			'Kĩ thuật'),
                    (4,			'Nhân sự'),
                    (5,			'Kế Toán'),
					(6,			'Bảo vệ'),
					(7,			'Tài Chính'),
                    (8,			'Thư kí'),
                    (9,			'Giám Đốc'),
                    (10,		'Bán Hàng');
			
            -- add data `Position`--
	INSERT INTO `Position` ( PositionName )
    VALUES			('Dev' ),
					('Test' ),
					('Scrum Master' ),
					('PM' );
		
			-- add data Account--
	INSERT INTO `Account` (Email ,			 		Username,	 			FullName, 			DepartmentID,	 PositionID, 		CreateDate)
    VALUES			('nhaivu22@gmail.com',			'nhaivunhai',			'Vu thi nhai',			'2',			'1',			'2020-01-02'),
					('hongvu67@gmail.com',			'honghong',				'Ta thi hong',			'1',			'3',			'2018-02-15'),
					('ductn44@gmail.com',			'manhduc',				'Tran manh duc',		'3',			'4',			'2021-05-09'),
					('thanhtamtn@gmail.com',		'tamthi',				'Mai thi tam',			'5',			'3',			'2020-01-02'),
					('vusangty@gmail.com',			'sangthu',				'Ta van sang',			'8',			'2',			'2019-03-17'),
					('hanoity@gmail.com',			'noivu',				'Thanh tung hoa',		'6',			'3',			'2020-08-12'),
					('thanhhuowng@gmail.com',		'thuongthu',			'Ly thanh tu',			'7',			'1',			'2019-12-18'),
					('dinhcong@gmail.com',			'congson',				'Dinh cong son',		'9',			'4',			'2019-06-8'),
					('kimhue@gmail.com'	,			'huethu',				'Tran thi hue',			'4',			'2',			'2020-05-18'),
					('manhhieu8@gmail.com',			'hieumanh',				'Nguyen manh hieu',		'10',			'1',			'2021-08-13');
    

-- Add data Group--
INSERT INTO `Group`(GroupName, 				CreatorID,		CreateDate)
VALUES				('test1',				'2',			'2021-02-04'),
					('test2',				'1',			'2021-08-04'),
					('Development',			'3',			'2021-12-05'),
					('Sale1',				'5',			'2021-06-12'),
					('Sale2',				'8',			'2021-11-08'),
					('Marketing',			'6',			'2022-07-04'),
                    ('Doi tac',				'7',			'2019-08-13'),
                    ('Thu nghiem',			'9',			'2021-02-15'),
                    ('Yeu cau',				'4',			'2020-09-02'),
                    ('laptp',				'10',			'2021-09-15');
-- add data GroupAccount
INSERT INTO `GroupAccount`(GroupID,			AccountID,			JoinDate)
VALUES						(	'1',			   '1',				'2019-03-05'),
							(	'1',    			'2',				'2020-03-07'),
							(	'3',    			'3',				'2020-03-09'),
							(	'3',    			'4',				'2020-03-10'),
							(	'5',    			'5',				'2020-03-28'),
							(	'1',    			'3',				'2020-04-06'),
							(	'1',    			'7',				'2020-04-07'),
							(	'8',    			'3',				'2020-04-08'),
							(	'1',    			'9',				'2020-04-09'),
							(	'10',    			'10',				'2020-04-10');
					
                    
			-- add data TypeQuestion
		INSERT INTO TypeQuestion(TypeName)
        VALUES					('Essay'			), 
								('Multiple-Choice'	); 
                                
                                
					-- add data CategoryQuestion--
		INSERT INTO CategoryQuestion(CategoryName)
        VALUES						('Java'), 
									('.NET'), 
                                    ('SQL'), 
                                    ('Postman'),
                                    ('Ruby');
												
						-- add data Question--
			INSERT INTO Question(Content, 				CategoryID,		 TypeID		, 		CreatorID	, CreateDate )
            VALUES				('Câu hỏi về java',			'1'     ,	'1'        ,			'2',	'2020-08-04'),
								('Câu Hỏi về PHP',			'2'	,   '2'			,   		'2'		,'2020-04-05'),
								('Hỏi về C'		 ,			'1'		,   '2'			,   		'3'		,'2020-04-06'),
								('Hỏi về Ruby'	,			'4'		,   '1'			,   		'4'		,'2020-04-06'),
								('Hỏi về Postman',			'3'		,   '1'			,   		'5'		,'2020-04-06'),
								('Hỏi về ADO.NET',			'3'		,   '2'			,   		'6'		,'2020-04-06'),
								('Hỏi về ASP.NET',			'2'		,   '1'			,   		'7'		,'2020-04-06'),
								('Hỏi về C++'	,			'2'		,   '1'			,   		'8'		,'2020-04-07'),
								('Hỏi về mysql'	,			'4'		,   '2'			,   		'9'		,'2020-04-07'),
								('Hỏi về Python',			'2'     ,	'1'         ,			'10'	,'2020-04-08');
                                
                                
                                -- add data Answers
			INSERT INTO answer(Content				, QuestionID	, isCorrect	)
            VALUES				(N'Trả lời 01'		,   1			,	0		),
								(N'Trả lời 02'		,   1			,	1		),
								(N'Trả lời 03'		,   1			,	0		),
								(N'Trả lời 04'		,   1			,	1		),
								(N'Trả lời 05'		,   2			,	1		),
								(N'Trả lời 06'		,   3			,	1		),
								(N'Trả lời 07'		,   4			,	0		),
								(N'Trả lời 08'		,   8			,	0		),
								(N'Trả lời 09'		,   9			,	1		),
								(N'Trả lời 10'		,   10			,	1		);
                                
                                -- add data Exam
			INSERT INTO Exam(`Code`			, Title					, CategoryID	, Duration	, CreatorID		, CreateDate)
            VALUES			('VTIQ001'		, 'Đề thi C#'			,	1			,	60		,   '5'			,'2019-04-05'),
							('VTIQ002'		, 'Đề thi PHP'			,	2			,	60		,   '2'			,'2019-04-05'),
							('VTIQ003'		, 'Đề thi C++'			,	2			,	120		,   '2'			,'2019-04-07'),
							('VTIQ004'		, 'Đề thi Java'			,	3			,	60		,   '3'			,'2020-04-08'),
							('VTIQ005'		, 'Đề thi Ruby'			,	5			,	120		,   '4'			,'2020-04-10'),
							('VTIQ006'		, 'Đề thi Postman'		,	3			,	60		,   '6'			,'2020-04-05'),
							('VTIQ007'		, 'Đề thi mysql'		,	2			,	60		,   '7'			,'2020-04-05'),
							('VTIQ008'		, 'Đề thi Python'		,	2			,	60		,   '8'			,'2020-04-07'),
							('VTIQ009'		, 'Đề thi ADO.NET'		,	4			,	90		,   '9'			,'2020-04-07'),
							('VTIQ010'		, 'Đề thi ASP.NET'		,	1			,	90		,   '10'		,'2020-04-08');
                    
                    
				-- add data ExamQuestion--
		INSERT INTO ExamQuestion(ExamID	, QuestionID	) 
        VALUES					(1	,			5		),
								(	2	,		10		), 
								(	3	,		4		), 
								(	4	,		3		), 
								(	5	,		7		), 
								(	6	,		10		), 
								(	7	,		2		), 
								(	8	,		10		), 
								(	9	,		9		), 
								(	10	,		8		); 
			
            
            -- Hiển Thị Các Bảng --
	SELECT * FROM testing_system.account;
	SELECT * FROM testing_system.answer;
    SELECT * FROM testing_system.categoryquestion;
    SELECT * FROM testing_system.department;
    SELECT * FROM testing_system.exam;
    SELECT * FROM testing_system.examquestion;
    SELECT * FROM testing_system.group;
    SELECT * FROM testing_system.groupaccount;
    SELECT * FROM testing_system.position;
    SELECT * FROM testing_system.question;
    SELECT * FROM testing_system.typequestion;
    
    
    -- Question 1--
   SELECT *
   FROM department;
    
    -- Question 2--
SELECT DepartmentID
FROM department
WHERE departmentname = 'sale';
-- Question 3--
SELECT 		* 
FROM 		`Account` 
WHERE 		LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`)
ORDER BY 	Fullname DESC;

-- Question 4--
SELECT GroupName
FROM `group`
WHERE CreateDate  <'2019-12-20';

-- Question 5
SELECT 		QuestionID
FROM 		Answer
GROUP BY 	QuestionID
HAVING 		COUNT(QuestionID) >= 4;

-- Question 6
SELECT 		* 
FROM 		`Group`
ORDER BY 	CreateDate DESC 
LIMIT 5;
-- Question 7
DELETE 
FROM 		Exam 
WHERE 		CreateDate < '2019-12-20';

-- Question 9
UPDATE `account`
SET fullname = 'Nguyễn bá lộc',  email = 'loc.nguyenba@vti.com.vn'
WHERE accountid = '5';

-- Question 10

   