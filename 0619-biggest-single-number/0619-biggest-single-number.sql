
SELECT max(num) as num
from  MyNumbers
WHERE num IN(
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1 
); 

-- frequency check kiya equal to 1 

