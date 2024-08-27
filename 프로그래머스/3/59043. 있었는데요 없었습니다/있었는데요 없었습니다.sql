select 
    i.ANIMAL_ID, i.NAME
from
    ANIMAL_INS as i
join
    ANIMAL_OUTS as o
on 
    o.ANIMAL_ID = i.ANIMAL_ID
where
    o.datetime < i.datetime
order by
    i.DATETIME asc