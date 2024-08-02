SELECT name
FROM animal_ins
WHERE datetime = (SELECT min(datetime) FROM animal_ins);