SELECT os.user_id, os.product_id
FROM online_sale os
GROUP BY os.user_id, os.product_id
HAVING count(os.product_id) > 1
ORDER BY os.user_id asc, os.product_id desc;