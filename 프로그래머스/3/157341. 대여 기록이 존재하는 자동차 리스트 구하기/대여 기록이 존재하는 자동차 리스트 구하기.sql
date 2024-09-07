select 
    A.CAR_ID
from 
    CAR_RENTAL_COMPANY_CAR AS A
join 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY AS B
on 
    A.CAR_ID = B.CAR_ID
where 
    A.CAR_TYPE = '세단' and DATE_FORMAT(B.START_DATE, '%m') = '10'
group by 
    CAR_ID
order by 
    CAR_ID DESC