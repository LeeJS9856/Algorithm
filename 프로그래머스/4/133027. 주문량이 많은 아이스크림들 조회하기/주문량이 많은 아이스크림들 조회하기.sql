select a.flavor
from
(select flavor, sum(total_order) total_order
from july
group by 1) a inner join first_half f on a.flavor = f.flavor
order by a.total_order + f.total_order desc
limit 3