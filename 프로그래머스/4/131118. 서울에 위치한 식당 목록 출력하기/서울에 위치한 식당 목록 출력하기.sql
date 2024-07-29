SELECT ri.rest_id, ri.rest_name, ri.food_type, ri.favorites, ri.address, round(avg(rr.review_score), 2) as score
FROM rest_info ri
JOIN rest_review rr ON ri.rest_id = rr.rest_id
WHERE ri.address like '서울%'
GROUP BY ri.rest_id
ORDER BY score desc, ri.favorites desc;