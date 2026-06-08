
SELECT c.visited_on,
(
    SELECT SUM(amount)
    from customer 
    where visited_on between date_sub(c.visited_on, INTERVAL 6 day)
    and c.visited_on
) as amount,
ROUND((
    SELECT SUM(amount)/7
    from customer 
    where visited_on between date_sub(c.visited_on, INTERVAL 6 day)
    and c.visited_on
),2) as average_amount

from customer c
where visited_on >=(
    select DATE_ADD(min(visited_on), INTERVAL 6 day)
    FROM Customer 
)  
group by visited_on
order by visited_on ASC