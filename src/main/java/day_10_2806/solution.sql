-- https://www.hackerrank.com/challenges/weather-observation-station-6/problem?isFullScreen=true
select distinct CITY
from STATION
where CITY like 'A%'
   or CITY like 'O%'
   or CITY like 'E%'
   or CITY like 'I%'
   or CITY like 'E%'
   or CITY like 'U%';