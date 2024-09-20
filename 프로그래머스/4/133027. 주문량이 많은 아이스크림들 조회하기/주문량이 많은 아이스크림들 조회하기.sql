select 
    FLAVOR
from (
    select 
        FLAVOR, 
        sum(TOTAL_ORDER) as TOTAL_SALES
    from (
        select 
            FLAVOR, 
            TOTAL_ORDER 
        from FIRST_HALF
        
        union all
        
        select 
            FLAVOR, 
            TOTAL_ORDER 
        from 
            JULY
    ) as combined
    group by FLAVOR
) as total_sales
order by 
    TOTAL_SALES desc
limit 3;