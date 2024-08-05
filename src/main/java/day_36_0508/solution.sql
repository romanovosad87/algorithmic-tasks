-- https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true

SELECT
    MAX(total_earnings) AS max_total_earnings,
    COUNT(*) AS num_employees_with_max_earnings
FROM (
         SELECT
             employee_id,
             name,
             SUM(salary*months) AS total_earnings
         FROM Employee
         GROUP BY employee_id, name
     ) AS subquery
WHERE total_earnings = (
    SELECT MAX(total_earnings)
    FROM (
             SELECT
                 employee_id,
                 name,
                 SUM(salary*months) AS total_earnings
             FROM Employee
             GROUP BY employee_id, name
         ) AS subquery2
);
