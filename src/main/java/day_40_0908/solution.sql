-- https://www.hackerrank.com/challenges/weather-observation-station-14/problem?isFullScreen=true
select truncate(max(LAT_N), 4)
from STATION
where LAT_N < 137.2345;