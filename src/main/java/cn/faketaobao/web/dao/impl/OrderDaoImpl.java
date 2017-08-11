/** 
 * Project Name:FakeTaobao 
 * File Name:OrderDaoImpl.java 
 * Package Name:cn.faketaobao.web.dao.impl 
 * Date:2017年8月11日上午9:08:50 
 * 
 */  
  
package cn.faketaobao.web.dao.impl;  

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.faketaobao.web.dao.OrderDao;
import cn.faketaobao.web.pojo.OrderBean;

/** 
 * ClassName:OrderDaoImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午9:08:50 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
public class OrderDaoImpl implements OrderDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public OrderBean addOrder(OrderBean bean) throws Exception {
		try{
			sessionFactory.getCurrentSession().save(bean);
			return bean;
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("添加订单失败");
		}
	}

	@Override
	public OrderBean getOrder(Integer id) throws Exception {
		OrderBean bean = null;
		try{
			bean = (OrderBean) sessionFactory.getCurrentSession().get(OrderBean.class,id);
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("添加订单失败");
		}
		
		return bean;
	}

	
}
 