-- https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?isFullScreen=true

select con.CONTINENT, floor(avg(c.POPULATION))
from CITY c
         join COUNTRY con
              on c.COUNTRYCODE = con.CODE
group by con.CONTINENT;