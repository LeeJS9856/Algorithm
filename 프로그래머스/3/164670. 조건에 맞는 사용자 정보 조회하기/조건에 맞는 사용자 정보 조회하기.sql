-- 코드를 입력하세요
select u.user_id, 
    u.nickname, 
    concat(u.city,' ', u.street_address1, ' ',u.street_address2) 전체주소, 
    concat(substr(tlno, 1, 3),'-',substr(tlno,4,4),'-',substr(tlno,8,4)) 전화번호
from used_goods_board b inner join used_goods_user u on b.writer_id = u.user_id
group by 1
having count(b.writer_id) >= 3
order by 1 desc