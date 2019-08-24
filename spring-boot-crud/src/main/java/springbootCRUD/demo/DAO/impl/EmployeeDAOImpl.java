package springbootCRUD.demo.DAO.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import springbootCRUD.demo.DAO.EmployeeDAO;
import springbootCRUD.demo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;

	public EmployeeDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> getListOfEmployees() {
		Session session = entityManager.unwrap(Session.class);
		List<Employee> employee = session.createQuery("from Employee").getResultList();
		return employee;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee emp = session.get(Employee.class, id);
		return emp;
	}

	@Override
	public void save(Employee emp) {
		Session session = entityManager.unwrap(Session.class);
		session.save(emp);

	}

	@Override
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		session.createQuery("delete from Employee e where e.id=" + id).executeUpdate();
		return;
	}

}
