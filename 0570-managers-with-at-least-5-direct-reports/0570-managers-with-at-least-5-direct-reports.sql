# Write your MySQL query statement below
SELECT e1.name
FROM Employee e1
JOIN Employee e2
ON  e1.id = e2.managerID
GROUP BY e2.managerID  #Ye same managerId wali rows ko ek group me daal deta hai. phir uske baad count kare ga check kare ga having >= 5 hai ya nhi 
HAVING COUNT(e2.managerId) >= 5;
