# Write your MySQL query statement below
SELECT q1.person_name
FROM Queue q1
join Queue q2
On q1.turn >= q2.turn
group by q1.turn
Having SUM(q2.weight) <= 1000 
ORDER BY SUM(q2.weight) DESC
LIMIT 1
