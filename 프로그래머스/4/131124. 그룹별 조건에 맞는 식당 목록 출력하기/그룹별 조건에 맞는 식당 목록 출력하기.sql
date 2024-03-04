with a as (select member_id, count(*) cnt
    from rest_review
    group by 1),
    b as (select member_id
    from a
    where cnt = (select max(cnt) from a)),
    c as (select m.member_name, r.review_text, substr(r.review_date, 1, 10)
    from member_profile m inner join rest_review r on m.member_id = r.member_id
    where m.member_id in (select member_id
    from a
    where cnt = (select max(cnt) from a))
    order by 3, 2)
    
select *
from c