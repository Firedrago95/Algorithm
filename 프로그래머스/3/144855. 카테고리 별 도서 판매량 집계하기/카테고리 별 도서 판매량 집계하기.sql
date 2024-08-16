select b.category as CATEGORY, sum(bs.sales) as TOTAL_SALES
from book_sales as bs
join book as b
on bs.book_id = b.book_id
where year(bs.sales_date) = 2022 and month(bs.sales_date) = 1
group by b.category
order by b.category asc;
