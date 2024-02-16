-- 코드를 입력하세요
select b.category, sum(bs.sales) total_sales
from BOOK b inner join BOOK_SALES bs on b.BOOK_ID = bs.BOOK_ID
where bs.sales_date like '2022-01%'
group by 1
order by b.category