select i.id as ID, ni.fish_name as FISH_NAME, i.length as LENGTH 
from fish_info as i
join fish_name_info as ni
on i.fish_type = ni.fish_type
where i.length in (
    select max(length)
    from fish_info
    where fish_type = i.fish_type
    group by fish_type
)
order by ID asc;
