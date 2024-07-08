-- https://www.hackerrank.com/challenges/weather-observation-station-11/problem?isFullScreen=true
select distinct CITY  from STATION
where lower(substring(CITY, 1, 1)) not in ('a', 'e', 'u', 'i', 'o') or
    lower(substring(CITY, -1, 1)) not in ('a', 'e', 'u', 'i', 'o');