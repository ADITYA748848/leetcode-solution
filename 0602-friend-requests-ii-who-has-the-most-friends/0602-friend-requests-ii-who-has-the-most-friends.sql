SELECT id , count(*) as num
from (
    select requester_id as id
    FROM RequestAccepted 

UNION ALL

    select accepter_id as num
    from RequestAccepted 
) as aditya 

group by id
order by num desc
limit 1
