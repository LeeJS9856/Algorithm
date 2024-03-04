select month(start_date) month, car_id, count(*) records
from car_rental_company_rental_history
where substr(start_date, 1, 7) between '2022-08' and '2022-10'
    and car_id in (select a.car_id from (
        select car_id, count(*) records from car_rental_company_rental_history 
        where substr(start_date, 1, 7) between '2022-08' and '2022-10'
        group by car_id
        having records >= 5) a )
group by 1, 2
order by 1, 2 desc