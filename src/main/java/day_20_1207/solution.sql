-- https://www.codewars.com/kata/58112f8004adbbdb500004fe/train/sql

select 'US' as location, id, name, price, card_name, card_number, transaction_date
from ussales
where price > 50
union all
select 'EU' as location, id, name, price, card_name, card_number, transaction_date
from eusales
where price > 50
order by location desc, id;