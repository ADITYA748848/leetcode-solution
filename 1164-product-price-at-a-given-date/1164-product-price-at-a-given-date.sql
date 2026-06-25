# Write your MySQL query statement below
SELECT  product_id , new_price as price
FROM Products
where (product_id, change_date) in (
    select product_id,  max(change_date)
    FROM Products
    where change_date <= "2019-08-16" 
    group by product_id
)
UNION 

SELECT  product_id , 10 as price
FROM Products
WHERE product_id  NOT IN (
    select product_id
    FROM Products
    where change_date <= "2019-08-16" 

)