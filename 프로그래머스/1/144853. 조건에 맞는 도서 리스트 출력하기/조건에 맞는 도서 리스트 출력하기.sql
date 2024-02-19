-- 코드를 입력하세요
select book_id, substr(published_date, 1, 10) published_date
from BOOK
where substr(published_date, 1, 4) = 2021 and category = '인문'
order by published_date