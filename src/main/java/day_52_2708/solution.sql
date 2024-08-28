-- https://www.hackerrank.com/challenges/harry-potter-and-wands/problem?isFullScreen=true

select w.id, wp.age, w.coins_needed, w.power
from Wands w
         join Wands_Property wp
              on w.code = wp.code
where wp.is_evil = 0 and
    w.coins_needed = (
        select min(w1.coins_needed)
        from Wands w1
        where w1.code = w.code
          and w1.power = w.power)
order by w.power desc, wp.age desc;