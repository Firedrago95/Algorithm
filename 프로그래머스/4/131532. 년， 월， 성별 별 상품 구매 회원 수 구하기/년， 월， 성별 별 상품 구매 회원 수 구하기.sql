select
    year(os.SALES_DATE) as YEAR,
    month(os.SALES_DATE) as MONTH,
    ui.GENDER as GENDER,
    count(distinct ui.USER_ID) as USERS
from
    USER_INFO as ui
join
    ONLINE_SALE as os on ui.USER_ID = os.USER_ID
where
    GENDER is not null
group by
    year(os.SALES_DATE), month(os.SALES_DATE), ui.GENDER
order by
    YEAR, MONTH, GENDER
