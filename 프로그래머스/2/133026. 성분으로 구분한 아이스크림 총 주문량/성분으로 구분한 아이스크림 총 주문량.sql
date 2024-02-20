-- 코드를 입력하세요
select ii.ingredient_type, sum(total_order) total_order
from first_half fh inner join icecream_info ii on fh.flavor = ii.flavor
group by 1
order by total_order