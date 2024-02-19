-- 코드를 입력하세요
select ai.animal_id, ai.animal_type, ai.name
from ANIMAL_INS ai inner join ANIMAL_OUTS ao on ai.animal_id = ao.animal_id
where ai.sex_upon_intake like 'Intact%' and (ao.sex_upon_outcome like 'Spayed%' or ao.sex_upon_outcome like 'Neutered%')
order by ai.animal_id