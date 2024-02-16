-- 코드를 입력하세요
select p.product_code, p.price*sum(os.sales_amount) as sales
from PRODUCT p inner join OFFLINE_SALE os on p.product_id = os.product_id
group by 1
order by 2 desc, 1