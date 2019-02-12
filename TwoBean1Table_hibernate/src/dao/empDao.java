package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import bean.EmpBean;

public class empDao {
	public int Insert(EmpBean e)
{
	int x=0; 
	
	SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tt=ss.beginTransaction();
	Object o=ss.save(e);
	if(o!=null)
		x=1;
	tt.commit();
	System.out.println("dao call");
	ss.close();
	return x;
}

}
