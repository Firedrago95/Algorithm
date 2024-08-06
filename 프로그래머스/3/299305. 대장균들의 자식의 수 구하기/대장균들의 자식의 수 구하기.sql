SELECT a.id, ifnull(b.child_count,0) as child_count
FROM ecoli_data a
LEFT JOIN (
    SELECT parent_id, count(parent_id) as child_count
    FROM ecoli_data
    GROUP BY parent_id
    ) b
ON b.parent_id = a.id;