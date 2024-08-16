-- https://www.hackerrank.com/challenges/weather-observation-station-19/problem?isFullScreen=true

select round(sqrt(power(min(LAT_N) - max(LAT_N), 2) + power(min(LONG_W) - max(LONG_W), 2)), 4)
from STATION;