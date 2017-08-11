/** 
 * Project Name:FakeTaobao 
 * File Name:Order.java 
 * Package Name:cn.faketaobao.web.pojo 
 * Date:2017年8月11日上午8:33:39 
 * 
 */  
  
package cn.faketaobao.web.pojo;  

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

/** 
 * ClassName:Order 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午8:33:39 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name="TB_ORDER")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class OrderBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@GenericGenerator(name = "paymentableGenerator",strategy = "native")
	@Column(name="ORDER_ID")
	private Integer orderId;
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIME",updatable=false)
	private Date createTime ;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DELETE_TIME",updatable=true)
	private Date deleteTime;
	
	@Column(name="ISDELETED",nullable=false)
	private Boolean isDeleted = false;
	
	@ManyToMany
	@JoinTable(name="ORDER_ITEM_RELATION",joinColumns={@JoinColumn(name="ORDER_ID",referencedColumnName="ORDER_ID")},
	inverseJoinColumns={@JoinColumn(name="ITEM_ID",referencedColumnName="ITEM_ID")})
	private Set<ItemBean> items = new HashSet<ItemBean>();

	public OrderBean() {
		super();
	}

	public OrderBean(Set<ItemBean> items) {
		super();
		this.items = items;
	}
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Set<ItemBean> getItems() {
		return items;
	}

	public void setItems(Set<ItemBean> items) {
		this.items = items;
	}
	
	
	
}
 