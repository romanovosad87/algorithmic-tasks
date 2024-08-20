-- https://www.hackerrank.com/challenges/weather-observation-station-20/problem?isFullScreen=true

SELECT ROUND(AVG(LAT_N), 4) AS MEDIAN_LAT_N
FROM (
         SELECT LAT_N
         FROM (
                  SELECT LAT_N,
                         ROW_NUMBER() OVER (ORDER BY LAT_N) AS row_num,
                          COUNT(*) OVER() AS total_count
                  FROM STATION
              ) AS ranked
         WHERE row_num IN (FLOOR((total_count + 1) / 2), CEIL((total_count + 1) / 2))
     ) AS median_subquery;