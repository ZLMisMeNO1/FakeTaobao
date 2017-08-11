/** 
 * Project Name:FakeTaobao 
 * File Name:ItemServiceImpl.java 
 * Package Name:cn.faketaobao.web.service.impl 
 * Date:2017年8月11日上午9:15:32 
 * 
 */  
  
package cn.faketaobao.web.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.faketaobao.web.dao.ItemDao;
import cn.faketaobao.web.pojo.ItemBean;
import cn.faketaobao.web.service.ItemService;

/** 
 * ClassName:ItemServiceImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午9:15:32 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public ItemBean addItem(String itemName, Float price, Integer sumItems)
			throws Exception {
		ItemBean itemBean = new ItemBean(itemName,price,sumItems);
		
		return itemDao.addItem(itemBean);
	}

}
 