with cte as (
    select  year(differentiation_date) as year,
            max(size_of_colony) as max_price
    from ecoli_data
    group by year(differentiation_date)
)

select year(d.differentiation_date) as YEAR, c.max_price - d.size_of_colony as YEAR_DEV, d.id as ID
from ecoli_data d
join cte c
on year(d.differentiation_date) = c.year
order by 1, 2;
