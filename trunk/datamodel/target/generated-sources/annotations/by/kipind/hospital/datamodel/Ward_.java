package by.kipind.hospital.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ward.class)
public abstract class Ward_ extends by.kipind.hospital.datamodel.AbstractEntity_ {

	public static volatile SingularAttribute<Ward, Integer> comfortLvl;
	public static volatile SingularAttribute<Ward, Integer> wardNum;
	public static volatile SetAttribute<Ward, Personal> personal;

}

