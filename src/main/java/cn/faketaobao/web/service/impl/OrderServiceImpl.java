/** 
 * Project Name:FakeTaobao 
 * File Name:OrderServiceImpl.java 
 * Package Name:cn.faketaobao.web.service.impl 
 * Date:2017年8月11日上午9:37:31 
 * 
 */  
  
package cn.faketaobao.web.service.impl;  

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.faketaobao.web.dao.ItemDao;
import cn.faketaobao.web.dao.OrderDao;
import cn.faketaobao.web.pojo.ItemBean;
import cn.faketaobao.web.pojo.OrderBean;
import cn.faketaobao.web.service.OrderService;

/** 
 * ClassName:OrderServiceImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午9:37:31 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private ItemDao itemDao;
	
	@Override
	public OrderBean addOrder(Integer[] items) throws Exception {
		Set<ItemBean> set = new HashSet<ItemBean>();
		ItemBean bean ;
		for(int i=0;i<items.length;i++) {
			bean = itemDao.getItem(items[i]);
			set.add(bean);
		}
		OrderBean roder = new OrderBean(set);
		return orderDao.addOrder(roder);
	}

	@Override
	public OrderBean getOrder(Integer id) throws Exception {
		return orderDao.getOrder(id);
	}

}
 