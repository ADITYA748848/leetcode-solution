# Write your MySQL query statement below
SELECT DISTINCT  author_id AS id # DISTINCT iska mtlb hai dublicate remove karna  or mujhe ID return karna tha esliye AS a id likha 
FROM Views
WHERE author_id = viewer_id   # author ne khud article dekha.
ORDER BY id;  # id in ascending order me Sorting ki.
