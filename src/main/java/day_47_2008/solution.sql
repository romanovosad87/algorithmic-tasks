-- https://www.hackerrank.com/challenges/asian-population/problem?isFullScreen=true

select sum(c.POPULATION)
from CITY c
         join COUNTRY con
              on c.COUNTRYCODE = con.CODE
where con.CONTINENT = 'Asia';