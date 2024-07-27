SELECT
    dr_name, dr_id, mcdp_cd, date_format(hire_ymd, '%Y-%m-%d') as hire_ymd
FROM
    doctor
WHERE
    mcdp_cd = 'CS' or mcdp_cd = 'GS'
ORDER BY
    hire_ymd desc, dr_name asc;