select sum(g.score) as SCORE, g.emp_no, e.emp_name, e.position, e.email
from hr_employees as e
join hr_grade as g
on g.emp_no = e.emp_no
group by emp_no
order by 1 desc
limit 1;
