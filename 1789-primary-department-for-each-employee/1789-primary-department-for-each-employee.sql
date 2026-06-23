# Write your MySQL query statement below
SELECT  distinct employee_id ,
       department_id
FROM Employee 
WHERE employee_id in(
    SELECT employee_id
    FROM Employee
    group by employee_id
    HAVING count(employee_id) =1
) OR primary_flag ='Y'
ORDER by employee_id ;
