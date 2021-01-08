/**
 * 訂單資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Order implements Serializable {

	@Id
	@Column(name="Order_id")
	private String Order_id;//        nvarchar(50) NOT NULL PRIMARY KEY,

	@Column(name="Status")
    private String Status;//          varchar(2) NULL,

	@Column(name="Cust_id")
    private String Cust_id;//         nvarchar(50) NULL,

	@Column(name="Order_name")
    private String Order_name;//      nvarchar(50) NULL,

	@Column(name="Order_cellphone")
    private String Order_cellphone;// nvarchar(15) NULL,

	@Column(name="Order_addr")
    private String Order_addr;//      nvarchar(200) NULL,

	@Column(name="Order_count")
    private Integer Order_count;//     int NULL,

	@Column(name="Order_all_price")
    private Double Order_all_price;// decimal(11,2) NULL,

	@Column(name="Order_discount")
    private Double Order_discount;//  decimal(11,2) NULL,

	@Column(name="Order_date")
    private String Order_date;//      nvarchar(8) NULL,
	
    @Column(name="Crt_time")
    private Timestamp Crt_time;//       datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//       datetime NOT NULL

	public String getOrder_id() {
		return Order_id;
	}

	public void setOrder_id(String order_id) {
		Order_id = order_id;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getCust_id() {
		return Cust_id;
	}

	public void setCust_id(String cust_id) {
		Cust_id = cust_id;
	}

	public String getOrder_name() {
		return Order_name;
	}

	public void setOrder_name(String order_name) {
		Order_name = order_name;
	}

	public String getOrder_cellphone() {
		return Order_cellphone;
	}

	public void setOrder_cellphone(String order_cellphone) {
		Order_cellphone = order_cellphone;
	}

	public String getOrder_addr() {
		return Order_addr;
	}

	public void setOrder_addr(String order_addr) {
		Order_addr = order_addr;
	}

	public Integer getOrder_count() {
		return Order_count;
	}

	public void setOrder_count(Integer order_count) {
		Order_count = order_count;
	}

	public Double getOrder_all_price() {
		return Order_all_price;
	}

	public void setOrder_all_price(Double order_all_price) {
		Order_all_price = order_all_price;
	}

	public Double getOrder_discount() {
		return Order_discount;
	}

	public void setOrder_discount(Double order_discount) {
		Order_discount = order_discount;
	}

	public String getOrder_date() {
		return Order_date;
	}

	public void setOrder_date(String order_date) {
		Order_date = order_date;
	}

	public Timestamp getCrt_time() {
		return Crt_time;
	}

	public void setCrt_time(Timestamp crt_time) {
		Crt_time = crt_time;
	}

	public Timestamp getUpd_time() {
		return Upd_time;
	}

	public void setUpd_time(Timestamp upd_time) {
		Upd_time = upd_time;
	}
	
	
}
