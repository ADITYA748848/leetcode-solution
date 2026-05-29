# Write your MySQL query statement below
SELECT substring(trans_date,1,7) as month, 
country,
count(id)  AS  trans_count,
SUM(state = 'approved') as approved_count,
SUM(amount)  AS trans_total_amount,
SUM((state = 'approved') * amount) as approved_total_amount 

FROM Transactions
GROUP BY month, country;
