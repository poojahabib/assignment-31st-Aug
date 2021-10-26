select department_id
from employees
group by department_id
having count(employee_id)>5;