-- https://www.hackerrank.com/challenges/occupations/problem?isFullScreen=true

-- ChatGPT support :-)
-- Inner Query: The inner query assigns a row number (rn) to each name within its respective occupation, ordered alphabetically.
-- Outer Query: The outer query uses MAX with a CASE statement to pivot the table, grouping by the row number (rn).
SELECT
    MAX(CASE WHEN Occupation = 'Doctor' THEN Name ELSE NULL END) AS Doctor,
    MAX(CASE WHEN Occupation = 'Professor' THEN Name ELSE NULL END) AS Professor,
    MAX(CASE WHEN Occupation = 'Singer' THEN Name ELSE NULL END) AS Singer,
    MAX(CASE WHEN Occupation = 'Actor' THEN Name ELSE NULL END) AS Actor
FROM (
         SELECT
             Name,
             Occupation,
             ROW_NUMBER() OVER (PARTITION BY Occupation ORDER BY Name) AS rn
         FROM OCCUPATIONS
     ) AS sub
GROUP BY rn
ORDER BY rn;