select
    CATEGORY,
    PRICE as MAXPRICE,
    PRODUCT_NAME
from
    FOOD_PRODUCT
where
    (CATEGORY, PRICE) in (
        select 
            CATEGORY,
            max(PRICE)
        from 
            FOOD_PRODUCT
        where
            CATEGORY in ('과자', '국', '김치', '식용유')
        group by
            CATEGORY
    )
order by
    MAXPRICE desc