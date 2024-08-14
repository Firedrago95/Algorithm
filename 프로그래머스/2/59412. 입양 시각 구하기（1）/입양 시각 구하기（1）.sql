select hour(datetime) as HOUR, count(*) as COUNT
from animal_outs
where hour(datetime) >= 9 and hour(datetime) <= 19
group by hour(datetime)
order by 1;