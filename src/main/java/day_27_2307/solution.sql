-- https://www.hackerrank.com/challenges/binary-search-tree-1/problem?isFullScreen=true

select N,
       case
           when P is null then 'Root'
           when N not in (select P from BST where P is not null) then 'Leaf'
           else 'Inner'
           end as value
from BST
order by N;

select N,
       case
           when P is null then 'Root'
           when exists (select * from BST as child where child.P = BST.N) then 'Inner'
           else 'Leaf'
           end as value
from BST
order by N;