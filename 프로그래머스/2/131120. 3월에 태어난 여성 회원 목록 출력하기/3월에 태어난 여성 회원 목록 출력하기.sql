SELECT member_id, member_name, gender, date_format(date_of_birth, '%Y-%m-%d') as date_of_birth
FROM member_profile mp
WHERE month(date_of_birth) = 3 AND tlno is not null AND gender = 'W';
