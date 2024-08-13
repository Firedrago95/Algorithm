select ingredient_type, sum(h.total_order) as TOTAL_ORDER
from first_half h
join icecream_info i
on i.flavor = h.flavor
group by i.ingredient_type
order by 2;
