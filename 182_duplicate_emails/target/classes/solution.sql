select
    Email
from
(select
    Email,
    count(distinct Id) as cnt
from
    person
group  by
    Email) as a
where a.cnt > 1
