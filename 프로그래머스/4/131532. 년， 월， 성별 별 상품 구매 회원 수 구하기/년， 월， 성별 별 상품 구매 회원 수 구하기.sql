-- 코드를 입력하세요
select year, month, gender, count(*)
from
(SELECT year(o.sales_date) year, month(o.sales_date) month, u.gender, o.user_id
from user_info u inner join online_sale o on u.user_id = o.user_id
where gender is not null
group by 1, 2, 3, o.user_id) a
group by 1,2,3
order by 1,2,3