select distinct
    d.ID,
    d.EMAIL,
    d.FIRST_NAME,
    d.LAST_NAME
from
    DEVELOPERS d
join
    SKILLCODES s on d.SKILL_CODE & s.CODE
where
    s.CATEGORY = 'Front End'
order by
    1 asc