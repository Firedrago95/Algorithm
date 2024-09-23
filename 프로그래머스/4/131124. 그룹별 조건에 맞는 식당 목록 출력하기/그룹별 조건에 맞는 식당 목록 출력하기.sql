select
    b.MEMBER_NAME,
    c.REVIEW_TEXT,
    date_format(c.REVIEW_DATE, '%Y-%m-%d') as REVIEW_DATE
from
    MEMBER_PROFILE b
join
    REST_REVIEW c on b.MEMBER_ID = c.MEMBER_ID
where
    b.MEMBER_ID = (
        select MEMBER_ID
        from REST_REVIEW
        group by MEMBER_ID
        order by count(REVIEW_ID) desc
        limit 1
    )
order by
    c.REVIEW_DATE asc,
    c.REVIEW_TEXT asc;
