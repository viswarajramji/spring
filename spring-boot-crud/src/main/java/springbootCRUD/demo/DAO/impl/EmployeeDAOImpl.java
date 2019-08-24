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

}
