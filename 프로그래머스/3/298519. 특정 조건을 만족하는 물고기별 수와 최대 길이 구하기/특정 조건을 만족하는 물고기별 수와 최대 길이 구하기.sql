select 
    count(fish_info.fish_type) as FISH_COUNT, 
    max(fish_info.length) as MAX_LENGTH, 
    fish_info.fish_type
from 
    fish_info
where 
    fish_info.fish_type in (
        select fish_type
        from fish_info
        group by fish_type
        having avg(length) >= 33
    )
group by 
    fish_info.fish_type
order by 
    fish_info.fish_type asc;
