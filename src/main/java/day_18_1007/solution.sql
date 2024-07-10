-- https://www.hackerrank.com/challenges/more-than-75-marks/problem?isFullScreen=true
select Name from STUDENTS
where Marks > 75
order by substring(Name, -3, 3), ID;