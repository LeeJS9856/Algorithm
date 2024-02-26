-- 코드를 입력하세요
select a.apnt_no, a.pt_name, a.pt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd
from 
(select a.apnt_no, p.pt_name, p.pt_no, a.mcdp_cd, a.apnt_ymd, a.mddr_id
from appointment a inner join patient p on a.pt_no = p.pt_no
where a.apnt_ymd like '2022-04-13%' and a.apnt_cncl_yn = 'N' and a.mcdp_cd = 'CS') a inner join doctor d on a.mddr_id = d.dr_id
order by 6