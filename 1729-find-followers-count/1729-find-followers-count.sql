# Write your MySQL query statement below
SELECT f1.user_id ,count(f1.follower_id) as followers_count 
FROM Followers f1
-- JOIN Followers f2
-- ON f1.user_id = f2.user_id
group by f1.user_id
order by f1.user_id asc;