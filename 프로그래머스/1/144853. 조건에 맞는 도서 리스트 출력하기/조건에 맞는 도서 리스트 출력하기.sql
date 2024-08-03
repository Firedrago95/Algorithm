SELECT book_id, date_format(published_date, '%Y-%m-%d')
FROM book
WHERE year(published_date) = 2021 AND category = '인문'
ORDER BY published_date asc;