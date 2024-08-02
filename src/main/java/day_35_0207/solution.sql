-- https://www.hackerrank.com/challenges/the-blunder/problem?isFullScreen=true
with actual_avg as (
    select avg(Salary) as actual_avg_salary
    from EMPLOYEES
),
     miscalculated_avg AS (
         select avg(cast(replace(cast(salary AS CHAR), '0', '') AS DECIMAL(10, 2))) as miscalculated_avg_salary
         FROM EMPLOYEES
     )
SELECT ceiling(a.actual_avg_salary - m.miscalculated_avg_salary) AS difference
FROM actual_avg a, miscalculated_avg m;