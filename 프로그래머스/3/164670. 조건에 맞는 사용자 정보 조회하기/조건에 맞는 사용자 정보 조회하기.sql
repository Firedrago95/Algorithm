select
    u.USER_ID, 
    u.NICKNAME, 
    concat(u.CITY, ' ', u.STREET_ADDRESS1, ' ', u.STREET_ADDRESS2) as '전체주소',
    concat(substring(u.TLNO, 1, 3), '-', substring(u.TLNO, 4, 4), '-', substring(u.TLNO, 8)) as '전화번호'
from
    USED_GOODS_USER as u
join (
    select
        WRITER_ID
    from
        USED_GOODS_BOARD
    group by
        WRITER_ID
    having 
        count(*) >= 3
) as b
on
    u.USER_ID = b.WRITER_ID
order by
    1 desc;