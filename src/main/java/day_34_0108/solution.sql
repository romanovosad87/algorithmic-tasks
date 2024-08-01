-- https://www.hackerrank.com/challenges/population-density-difference/problem?isFullScreen=true
select max(POPULATION) - min(POPULATION)
from CITY;