select department_id, count(*) as 'Employee Count'
from employees
group by department_id
having count(employee_id)>5;

select department_id, avg(salary)
from employees
group by department_id
having avg(salary)>20000;

select * 
from employees 
order by salary desc
limit 5;

SELECT CONCAT(first_name, ' ', last_name) AS 'Employee Name',department_name,country_name,region_name, employee_id
FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
JOIN countries c ON l.country_id = c.country_id
JOIN regions r ON c.region_id = r.region_id;
 
/*5. Retrieve details of all employees whose commission_pct is greater than commission_pct of employee with last name De Haan. */
select * from employees 
where ifnull(commission_pct,0)>(
					   select ifnull(commission_pct,0) from employees where last_name='De Haan');
                       
                       
