-- https://hackerrank.com/challenges/weather-observation-station-16/problem?isFullScreen=true
select round(min(LAT_N), 4)
from STATION
where LAT_N > 38.7780;