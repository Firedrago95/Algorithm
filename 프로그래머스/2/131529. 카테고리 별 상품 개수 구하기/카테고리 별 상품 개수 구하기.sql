select
    substring(PRODUCT_CODE, 1, 2) as CATEGORY,
    count(substring(PRODUCT_CODE, 1, 2)) as PRODUCTS
from
    PRODUCT
group by
    1
order by 
    1 asc;
