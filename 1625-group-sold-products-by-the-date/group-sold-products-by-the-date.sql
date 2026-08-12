# Write your MySQL query statement below
select (sell_date) as sell_date,
count(DISTINCT product) as num_sold ,GROUP_CONCAT(Distinct product) as products
from Activities
group by sell_date
