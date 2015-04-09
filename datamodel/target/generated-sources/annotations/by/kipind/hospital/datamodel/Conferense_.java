package by.kipind.hospital.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Conferense.class)
public abstract class Conferense_ extends by.kipind.hospital.datamodel.AbstractEntity_ {

	public static volatile SingularAttribute<Conferense, String> dayOrder;
	public static volatile SingularAttribute<Conferense, Date> conDateTime;
	public static volatile SingularAttribute<Conferense, Integer> conLvl;

}

