/** 
 * Project Name:FakeTaobao 
 * File Name:ItemService.java 
 * Package Name:cn.faketaobao.web.service 
 * Date:2017年8月11日上午9:14:25 
 * 
 */  
  
package cn.faketaobao.web.service;  

import cn.faketaobao.web.pojo.ItemBean;

/** 
 * ClassName:ItemService 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午9:14:25 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface ItemService {

	ItemBean addItem(String itemName,Float price,Integer sumItems) throws Exception;
}
 