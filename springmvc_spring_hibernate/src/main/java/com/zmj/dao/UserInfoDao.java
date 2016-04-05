package com.zmj.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserInfoDao implements IUserInfoDao {
	  
	 @Autowired  private HibernateTemplate hibernateTemplate;

	@Override
	public <T> T findById(Class<T> type, Serializable id) {
		// TODO Auto-generated method stub
		 return hibernateTemplate.get(type, id); 
	}

	@Override
	public <T> List<T> findAll(Class<T> type) {
		// TODO Auto-generated method stub
		 return hibernateTemplate.loadAll(type); 
	}

	@Override
	public void save(Object... entities) {
		// TODO Auto-generated method stub
		 for (Object entity : entities) {  
	            hibernateTemplate.save(entity);  
	        }  
	}

	@Override
	public void update(Object... entities) {
		// TODO Auto-generated method stub
		 for (Object entity : entities) {  
	            hibernateTemplate.update(entity);  
	        }  
	}

	@Override
	public void saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub
		 hibernateTemplate.saveOrUpdate(entity);  
	}

	@Override
	public void delete(Object... entities) {
		// TODO Auto-generated method stub
		 for (Object entity : entities) {  
	            if (entity != null) {  
	                hibernateTemplate.delete(entity);  
	            }  
	        }  
	}

	@Override
	public void deleteById(Class<?> type, Serializable id) {
		// TODO Auto-generated method stub
		 if (id == null) {  
	            return;  
	        }  
	        Object entity = findById(type, id);  
	        if (entity == null) {  
	            return;  
	        }  
	        delete(entity);  
	}

	@Override
	public void refresh(Object... entities) {
		// TODO Auto-generated method stub
		 for (Object entity : entities) {  
	            hibernateTemplate.refresh(entity);  
	        }  
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		 hibernateTemplate.flush();  
	}

}
