select animal_type as ANIMAL_TYPE, count(animal_type) as count
from animal_ins
where animal_type = 'Cat' OR animal_type = 'Dog'
group by animal_type
order by animal_type asc;