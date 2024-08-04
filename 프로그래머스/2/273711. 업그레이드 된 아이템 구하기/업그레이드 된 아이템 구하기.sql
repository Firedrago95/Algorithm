SELECT i.item_id, i.item_name, i.rarity
FROM item_info i
JOIN item_tree t
ON t.item_id = i.item_id
WHERE t.parent_item_id IN (
    SELECT item_id
    FROM item_info 
    WHERE rarity = 'RARE')
ORDER BY i.item_id desc;