select
    p.PRODUCT_CODE,
    sum(s.SALES_AMOUNT) * p.PRICE as SALES
from 
    PRODUCT as p
JOIN
    OFFLINE_SALE as s
ON 
    p.PRODUCT_ID = s.PRODUCT_ID
group by
    p.PRODUCT_ID
order by
    2 desc, p.PRODUCT_CODE asc;