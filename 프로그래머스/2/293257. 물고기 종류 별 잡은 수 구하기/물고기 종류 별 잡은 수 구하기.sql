select count(i.fish_type) as FISH_COUNT, ni.fish_name as FISH_NAME
from fish_info as i
join fish_name_info as ni
on i.fish_type = ni.fish_type
group by FISH_NAME
order by FISH_COUNT desc;