package by.kipind.hospital.datamodel;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.kipind.hospital.datamodel.Conferense;
import com.kipind.hospital.datamodel.Personal;
import com.kipind.hospital.datamodel.Visit;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Conferense.class)
public abstract class Conferense_ extends by.kipind.hospital.datamodel.AbstractEntity_ {

	public static volatile SetAttribute<Conferense, Visit> visits;
	public static volatile SingularAttribute<Conferense, String> dayOrder;
	public static volatile SetAttribute<Conferense, Personal> personal;
	public static volatile SingularAttribute<Conferense, Date> conDateTime;
	public static volatile SingularAttribute<Conferense, Integer> conLvl;

}

