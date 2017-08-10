/** 
 * Project Name:FakeTaobao 
 * File Name:TestDaoImpl.java 
 * Package Name:cn.faketaobao.web.dao.impl 
 * Date:2017年8月10日下午6:00:01 
 * 
 */  
  
package cn.faketaobao.web.dao.impl;  

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.faketaobao.web.dao.TestDao;
import cn.faketaobao.web.pojo.TestBean;

/** 
 * ClassName:TestDaoImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月10日 下午6:00:01 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
public class TestDaoImpl implements TestDao{

	@Autowired
	private SessionFactory commonSessionFactory;
	
	@Override
	public TestBean testAdd(TestBean bean) {
		commonSessionFactory.getCurrentSession().save(bean);
		return bean;
	}

	
}
 