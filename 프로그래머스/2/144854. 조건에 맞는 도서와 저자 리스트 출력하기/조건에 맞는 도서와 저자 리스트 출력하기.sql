select 
    b.BOOK_ID as BOOK_ID, 
    a.AUTHOR_NAME as AUTHOR_NAME, 
    date_format(b.PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
from 
    book as b
join
    author as a
on 
    b.author_id = a.author_id
where
    b.category = '경제'
order by 
    published_date asc;
