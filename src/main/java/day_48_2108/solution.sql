-- https://www.hackerrank.com/challenges/african-cities/problem?isFullScreen=true

select c.NAME
from CITY c
         join COUNTRY con
              on c.COUNTRYCODE = con.CODE
where con.CONTINENT = 'Africa';