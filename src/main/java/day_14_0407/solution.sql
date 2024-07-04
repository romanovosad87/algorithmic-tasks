-- https://www.hackerrank.com/challenges/weather-observation-station-9/problem?isFullScreen=true
select distinct CITY
from STATION
where lower(CITY) not like 'a%'
  and lower(CITY) not like 'e%'
  and lower(CITY) not like 'i%'
  and lower(CITY) not like 'o%'
  and lower(CITY) not like 'u%'
  and lower(CITY) not like 'e%';