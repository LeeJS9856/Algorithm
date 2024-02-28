select a.author_id, a.author_name, a.category, sum(a.price * bs.sales) total_sales
from
    (SELECT b.category, b.book_id, b.price, a.author_name, a.author_id
    from book b inner join author a on b.author_id = a.author_id) a inner join book_sales bs on a.book_id = bs.book_id
where bs.sales_date like '2022-01%'
group by 1, 2, 3
order by 1, 3 desc