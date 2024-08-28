select 
    i.NAME, i.DATETIME
from 
    ANIMAL_INS as i
left join
    ANIMAL_OUTS as o
ON 
    i.ANIMAL_ID = o.ANIMAL_ID
where
    o.DATETIME is null
order by
    i.DATETIME asc
limit 
    3;