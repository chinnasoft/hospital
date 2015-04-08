package by.kipind.hospital.dataaccess.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IPatientDAO;
import by.kipind.hospital.datamodel.Patient;

@Repository
public class PatientDAO extends AbstractDAO<Long, Patient> implements IPatientDAO {

	protected PatientDAO() {
		super(Patient.class);
		// TODO Auto-generated constructor stub
	}

	public List<Patient> getAllPatientsBySex(Integer sex) {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();

		CriteriaQuery<Patient> select = cBuilder.createQuery(Patient.class);
		Root<Patient> root = select.from(Patient.class);

		select.select(root);

		root.where(cBuilder.equal(select.get(Patient_.name), sex));

		TypedQuery<Patient> query = getEm().createQuery(select);
		List<Patient> results = query.getResultList();
		return results;
	}
}
