-- https://www.hackerrank.com/challenges/revising-aggregations-the-count-function/problem?isFullScreen=true

select count(ID)
from CITY
where Population > 100000;