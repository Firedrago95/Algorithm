with recursive CTE as (
    -- 최상위 부모 정의
    select id, parent_id, 1 as lvl
      from ecoli_data
     where parent_id is null
    union all
    -- 자식 정의
    select c.id, c.parent_id, p.lvl +1
      from CTE p inner join ecoli_data c on p.id = c.parent_id
)

select count(*) as count, c.lvl as generation
from cte c
where id not in (
    select distinct parent_id
    from ecoli_data
    where parent_id is not null
)
group by c.lvl
order by 2;