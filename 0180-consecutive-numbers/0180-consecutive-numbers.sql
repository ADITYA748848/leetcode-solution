# Write your MySQL query statement below
SELECT l1.num as ConsecutiveNums
FROM Logs l1, Logs l2, Logs l3 

where l1.id - l2.id = 1 
And l2.id - l3.id =1

AND l1.num = l2.num
AND l2.num = l3.num
AND l1.num = l3.num
group  by l1.num