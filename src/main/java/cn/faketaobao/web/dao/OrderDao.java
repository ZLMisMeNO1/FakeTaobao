/** 
 * Project Name:FakeTaobao 
 * File Name:OrderDao.java 
 * Package Name:cn.faketaobao.web.dao 
 * Date:2017年8月11日上午9:07:36 
 * 
 */  
  
package cn.faketaobao.web.dao;  

import cn.faketaobao.web.pojo.OrderBean;

/** 
 * ClassName:OrderDao 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午9:07:36 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface OrderDao {

	OrderBean addOrder(OrderBean bean) throws Exception;
	
	OrderBean getOrder(Integer id) throws Exception;
}
 