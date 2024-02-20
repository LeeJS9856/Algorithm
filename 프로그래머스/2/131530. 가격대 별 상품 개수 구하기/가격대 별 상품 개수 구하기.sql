-- 코드를 입력하세요
select price_group, count(price_group) products
from
(select concat(floor(price/10000)*10000) price_group
from product) a
group by 1
order by price_group