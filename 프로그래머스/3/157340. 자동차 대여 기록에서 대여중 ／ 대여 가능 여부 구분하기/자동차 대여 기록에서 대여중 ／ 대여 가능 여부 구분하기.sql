-- 코드를 입력하세요
select car_id, 
    case when car_id in (SELECT car_id
        from car_rental_company_rental_history
        where start_date <= '2022-10-16' and end_date >= '2022-10-16'
        group by 1) then '대여중'
    else '대여 가능' end availability
from car_rental_company_rental_history
group by 1
order by 1 desc
