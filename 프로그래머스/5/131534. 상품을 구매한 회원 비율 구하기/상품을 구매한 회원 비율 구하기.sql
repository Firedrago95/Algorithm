select
    year(o.SALES_DATE) as YEAR,
    month(o.SALES_DATE) as MONTH,
    count(distinct o.USER_ID) as PURCHASED_USERS,
    round(count(distinct o.USER_ID) / (select count(USER_ID) from USER_INFO where year(JOINED) = '2021'), 1) as SALES_AMOUNT
from
    ONLINE_SALE o
join
    USER_INFO u on o.USER_ID = u.USER_ID
where
    o.USER_ID in (
        select
            USER_ID
        from
            USER_INFO
        where
            year(JOINED) = 2021
    )
group by
    year(o.SALES_DATE), month(o.SALES_DATE)
order by
    1 asc, 2 asc