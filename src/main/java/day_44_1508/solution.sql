-- https://www.hackerrank.com/challenges/weather-observation-station-18/problem?isFullScreen=true
select round(
               abs(max(LAT_N) - min(LAT_N)) + abs(max(LONG_W) - min(LONG_W)), 4)
from STATION;