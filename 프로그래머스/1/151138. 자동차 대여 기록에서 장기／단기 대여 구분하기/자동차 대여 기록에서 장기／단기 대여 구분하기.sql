-- 코드를 입력하세요
SELECT history_id, 
    car_id, 
    substr(start_date, 1,10) start_date, 
    substr(end_date, 1, 10) end_date,
    case when datediff(end_date , start_date) >= 29 then '장기 대여'
    else '단기 대여' end rent_type
from car_rental_company_rental_history
where substr(start_date, 1, 7) = '2022-09'
order by 1 desc