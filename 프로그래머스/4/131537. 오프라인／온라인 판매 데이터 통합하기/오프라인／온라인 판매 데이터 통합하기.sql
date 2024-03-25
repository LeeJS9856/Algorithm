

            
select substr(sales_date,1,10) sales_date, product_id,user_id, sales_amount
    from online_sale
    where sales_date like "2022-03%"
union
    select substr(sales_date,1,10) sales_date, product_id,NULL, sales_amount
    from offline_sale
    where sales_date like "2022-03%"
order by sales_date, product_id, user_id