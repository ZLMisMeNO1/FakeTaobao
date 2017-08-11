/** 
 * Project Name:FakeTaobao 
 * File Name:ItemDao.java 
 * Package Name:cn.faketaobao.web.dao 
 * Date:2017年8月11日上午9:06:28 
 * 
 */  
  
package cn.faketaobao.web.dao;  

import cn.faketaobao.web.pojo.ItemBean;

/** 
 * ClassName:ItemDao 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午9:06:28 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface ItemDao {

	ItemBean addItem(ItemBean bean)  throws Exception;
	
	ItemBean getItem(Integer id) throws Exception;
}
 