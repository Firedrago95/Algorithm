SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO i
JOIN FISH_NAME_INFO ni
ON i.FISH_TYPE = ni.FISH_TYPE
WHERE ni.FISH_NAME = 'BASS' OR ni.FISH_NAME = 'SNAPPER';