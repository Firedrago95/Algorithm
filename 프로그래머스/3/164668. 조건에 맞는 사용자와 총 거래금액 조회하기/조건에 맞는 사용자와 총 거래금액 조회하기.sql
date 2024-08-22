with cte as (
    select writer_id, sum(price) as totalPrice
    from used_goods_board
    where status = 'DONE'
    group by writer_id
    having sum(price) >= 700000
)

select user_id as USER_ID, nickname as NICKNAME, cte.totalPrice as TOT
from used_goods_user as ugu
join cte 
on cte.writer_id = ugu.user_id
order by cte.totalPrice asc;