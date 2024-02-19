select ai.animal_id, ai.name
from ANIMAL_INS ai inner join ANIMAL_OUTS ao on ai.animal_id = ao.animal_id
order by ao.datetime - ai.datetime desc
limit 2