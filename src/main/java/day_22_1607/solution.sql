-- https://www.codewars.com/kata/5809575e166583acfa000083/solutions/sql
select rank()      over (order by sum(points) desc),
    case
    when clan = '' then '[no clan specified]' else clan
    end,
       sum(points) total_points,
       count(name) total_people
from people
group by clan;