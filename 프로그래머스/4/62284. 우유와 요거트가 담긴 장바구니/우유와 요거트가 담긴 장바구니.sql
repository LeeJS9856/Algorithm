select cart_id
from
(select cart_id, count(*) count
from
(select cart_id, name
from cart_products
where name in ('Milk', 'Yogurt')
group by 1, 2) a
group by 1) b
where count = 2
order by 1