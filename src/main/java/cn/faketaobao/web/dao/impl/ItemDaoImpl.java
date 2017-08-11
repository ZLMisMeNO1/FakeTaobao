/** 
 * Project Name:FakeTaobao 
 * File Name:ItemDaoImpl.java 
 * Package Name:cn.faketaobao.web.dao.impl 
 * Date:2017年8月11日上午9:08:40 
 * 
 */  
  
package cn.faketaobao.web.dao.impl;  

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.faketaobao.web.dao.ItemDao;
import cn.faketaobao.web.pojo.ItemBean;

/** 
 * ClassName:ItemDaoImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午9:08:40 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
public class ItemDaoImpl implements ItemDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public ItemBean addItem(ItemBean bean) throws Exception {
		
		try{
			sessionFactory.getCurrentSession().save(bean);
			return bean;
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("添加产品失败");
		}
	}

	@Override
	public ItemBean getItem(Integer id) throws Exception {
		
		return (ItemBean) sessionFactory.getCurrentSession().get(ItemBean.class, id);
	}
	

}
 