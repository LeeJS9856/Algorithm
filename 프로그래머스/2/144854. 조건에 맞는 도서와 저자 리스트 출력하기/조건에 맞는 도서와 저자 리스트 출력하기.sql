-- 코드를 입력하세요
select b.book_id, a.author_name, substr(b.published_date, 1, 10) published_date
from BOOK b inner join AUTHOR  a on  b.author_id = a.author_id
where b.category = '경제'
order by b.published_date