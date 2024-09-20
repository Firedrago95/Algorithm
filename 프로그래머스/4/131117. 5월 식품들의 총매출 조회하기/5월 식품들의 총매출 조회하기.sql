select
    p.PRODUCT_ID as PRODUCT_ID,
    p.PRODUCT_NAME as PRODUCT_NAME,
    sum(o.AMOUNT * p.PRICE) as TOTAL_SALES
from 
    FOOD_PRODUCT as p
join
    FOOD_ORDER as o on p.PRODUCT_ID = o.PRODUCT_ID
where
    o.PRODUCE_DATE >= '2022-05-01' and o.PRODUCE_DATE <= '2022-05-31'
group by
    p.PRODUCT_ID
order by
    TOTAL_SALES desc, p.PRODUCT_ID