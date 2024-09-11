select
    a.AUTHOR_ID as AUTHOR_ID,
    a.AUTHOR_NAME as AUTHOR_NAME,
    b.CATEGORY as CATEGORY,
    sum(s.SALES * b.PRICE) as TOTAL_SALES
from 
    BOOK as b
join 
    AUTHOR as a on b.AUTHOR_ID = a.AUTHOR_ID
join 
    BOOK_SALES as s on b.BOOK_ID = s.BOOK_ID
where
    year(s.SALES_DATE) = 2022 and month(s.SALES_DATE) = 1
group by
    a.AUTHOR_NAME, b.CATEGORY
order by
    a.AUTHOR_ID asc, b.CATEGORY desc
