select hd.dept_id as DEPT_ID, hd.dept_name_en as DEPT_NAME_EN, round(avg(he.sal),0) as AVG_SAL
from HR_DEPARTMENT as hd
join HR_EMPLOYEES as he
on hd.dept_id = he.dept_id
group by he.dept_id
order by 3 desc;