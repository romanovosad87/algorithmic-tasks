-- https://www.hackerrank.com/challenges/weather-observation-station-8/problem?isFullScreen=true
select distinct CITY
from STATION
where lower(substring(CITY, 1, 1)) in ('a', 'e', 'i', 'o', 'u')
  and lower(substring(CITY, -1, 1)) in ('a', 'e', 'i', 'o', 'u');