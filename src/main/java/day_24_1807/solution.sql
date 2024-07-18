--  https://www.codewars.com/kata/58113c03009b4fcc66000d29/train/sql
select d.id as id, d.name as name
from departments d
where d.id in
      (select s.department_id from sales s
       where s.price > 98);