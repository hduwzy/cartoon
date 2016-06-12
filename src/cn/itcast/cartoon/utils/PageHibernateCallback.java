package cn.itcast.cartoon.utils;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

public class PageHibernateCallback<T> implements HibernateCallback{
	private String hql;
	private Object[] params;
	private int beginCount;
	private int limit;
 	public PageHibernateCallback(String hql,Object[] params,int beginCount,int limit) {
		super();
		this.hql=hql;
		this.params=params;
		this.beginCount=beginCount;
		this.limit=limit;
	}

	public Object doInHibernate(Session arg0) throws HibernateException,
			SQLException {
		Query query=arg0.createQuery(hql);
		if(params!=null){
		for(int i=0;i<params.length;i++){
			query.setParameter(i, params[i]);
		}
		}
		query.setFirstResult(beginCount);
		query.setMaxResults(limit);
		return query.list();
	}

}
