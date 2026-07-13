SELECT Department, Employee, Salary FROM
(SELECT d.name as Department , e.name AS Employee, e.salary AS Salary,
dense_rank() over(partition by d.name order by e.salary DESC) as ranks
FROM Employee e
left join Department d  
on e.departmentId = d.id) temp
where ranks <=3
