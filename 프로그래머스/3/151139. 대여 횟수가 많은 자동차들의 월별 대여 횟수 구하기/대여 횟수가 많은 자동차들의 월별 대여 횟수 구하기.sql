select
    month(start_date) AS MONTH, 
    car_id AS CAR_ID, 
    count(history_id) AS RECORDS
from 
    car_rental_company_rental_history
where 
    start_date >= '2022-08-01' 
    and start_date < '2022-11-01' 
    and car_id IN (
        select car_id
        from car_rental_company_rental_history
        where start_date >= '2022-08-01' 
          and start_date < '2022-11-01'
        group by car_id
        having count(car_id) >= 5
    )
group by 
    month(start_date), car_id
order by 
    month(start_date), car_id desc;
