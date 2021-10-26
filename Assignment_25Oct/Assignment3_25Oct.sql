use hr;
/*Assignment-25Oct*/
/*1st que*/
select * from employees;
prepare insertstmt from 'insert into employees values(?,?,?,?,?,?,?,?,?,?,?)';

set @EmployeeId=1001;
set @FIRST_NAME ='ROHAN';
set @LAST_NAME = 'SHAH';
set @EMAIL=  'rohanshah@mail.com';
set @PHONENUMBER= '230-987-111';
set @HireDate='2019-3-4';
set @JobId='IT_PROG';
set @SALARY =45000;
set @COMMISSION_PCT= 0.2;
set @MANAGER_ID =101;
set @DEPARTMENT_ID= 10;

execute insertstmt using  @EmployeeId, @First_Name, @Last_Name ,@Email, @PhoneNumber, @HireDate, @JobId, @salary, @Commission_Pct, @Manager_Id, @Department_Id;
select * from Employees where employee_id=1001;


/*2nd que*/
prepare deletestmt from 'delete from employees where employee_id=?';
set @EmployeeId=157;
execute deletestmt using @EmployeeId;
select * from employees;


/*3rd que*/
prepare updatestmt from 'update employees set email=?, phone_number=? where employee_id=?';

set @Email='something@mail.com';
set @PhoneNumber='201-432-5431';
set @EmployeeId=999;

execute updatestmt using @Email,@PhoneNumber,@EmployeeId;

select * from employees where employee_id=999;


/*4th que*/
create table states (state_id varchar(40) primary key , state_name varchar (40) not null);
insert into states values ('S001','Madhya Pradesh');
insert into states values ('S002','Utter Pradesh');
select * from states;
 replace into states  (state_id, state_name)
 values('S002','UtterPradesh');
 select * from states;
 
 /*5th que*/
 create table student (student_roll_no int primary key, student_name varchar(40)not null, fees double);
 insert into student values(2001,'pooja',20000);
 select * from student;
 replace into student (student_roll_no,student_name ,fees)
 values (2001,'pooja',35000);
 select * from student;
 
