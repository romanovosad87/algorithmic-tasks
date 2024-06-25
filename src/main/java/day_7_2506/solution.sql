-- https://www.hackerrank.com/challenges/weather-observation-station-3/problem?isFullScreen=true
select distinct CITY from STATION where ID % 2 = 0;