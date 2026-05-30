# Write your MySQL query statement below
SELECT ROUND(SUM(player_login )/ count(distinct player_id),2) AS fraction
from
(select player_id,
datediff(event_date ,min(event_date) over(partition by player_id)) = 1 as player_login
from activity )as new_table

