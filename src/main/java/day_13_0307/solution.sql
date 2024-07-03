-- https://www.codewars.com/kata/593ef0e98b90525e090000b9
select th.id, th.heads, bh.legs, th.arms, bh.tails,
       case
           when th.heads > th.arms then 'BEAST'
           when bh.tails > bh.legs then 'BEAST'
           else 'WEIRDO'
           end as species
from top_half th
         join bottom_half bh
              on th.id = bh.id
order by species;