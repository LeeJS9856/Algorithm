select p.*
from
(select count(host_id) count, host_id
from places
group by 2) a inner join places p on a.host_id = p.host_id
where a.count > 1
order by p.id