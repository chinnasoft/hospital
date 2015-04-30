package by.kipind.hospital.datamodel;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.kipind.hospital.datamodel.Checkup;
import com.kipind.hospital.datamodel.Personal;
import com.kipind.hospital.datamodel.Prescribe;
import com.kipind.hospital.datamodel.ResultSource;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Prescribe.class)
public abstract class Prescribe_ extends by.kipind.hospital.datamodel.AbstractEntity_ {

	public static volatile SingularAttribute<Prescribe, String> resValue;
	public static volatile SingularAttribute<Prescribe, Personal> resPersonal;
	public static volatile SingularAttribute<Prescribe, String> coment;
	public static volatile SingularAttribute<Prescribe, Date> resDt;
	public static volatile SingularAttribute<Prescribe, Checkup> checkup;
	public static volatile SetAttribute<Prescribe, ResultSource> resSourseList;

}

