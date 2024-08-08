with recursive cte as (
    select id, parent_id, 1 as lvl
    from ecoli_data
    where parent_id is null
    
    union all
    
    select ed.id, ed.parent_id, c.lvl + 1
    from cte c
    join ecoli_data ed
    on c.id = ed.parent_id
)
select id
from cte
where lvl = 3
order by id asc;