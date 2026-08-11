-- # Write your MySQL query statement below
-- select max(salary) AS SecondHighestSalary
-- from Employee
-- where salary < (  
--     select MAX(salary)
--     from employee
-- );
select (select distinct salary
from Employee
order by salary desc 
limit 1 offset 1
)  as SecondHighestSalary