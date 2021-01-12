/**
 * 客戶資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package ims.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Customer implements Serializable {

	@Id
	@Column(name="Cust_id")
	private String Cust_id;//        nvarchar(50) NOT NULL PRIMARY KEY,

	@Column(name="Cust_name")
    private String Cust_name;//      nvarchar(50) NULL,

	@Column(name="Cust_tel")
    private String Cust_tel;//       nvarchar(15) NULL,

	@Column(name="Cust_cellphone")
    private String Cust_cellphone;// nvarchar(15) NULL,

	@Column(name="Cust_addr")
    private String Cust_addr;//      nvarchar(200) NULL,

	@Column(name="Cust_email")
    private String Cust_email;//     nvarchar(120) NULL,

	@Column(name="Delivery_addr")
    private String Delivery_addr;//  nvarchar(200) NULL,

	@Column(name="Birthday")
    private String Birthday;//       nvarchar(8) NULL,

	@Column(name="Crt_time")
    private Timestamp Crt_time;//       datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//       datetime NOT NULL

	public String getCust_id() {
		return Cust_id;
	}

	public void setCust_id(String cust_id) {
		Cust_id = cust_id;
	}

	public String getCust_name() {
		return Cust_name;
	}

	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}

	public String getCust_tel() {
		return Cust_tel;
	}

	public void setCust_tel(String cust_tel) {
		Cust_tel = cust_tel;
	}

	public String getCust_cellphone() {
		return Cust_cellphone;
	}

	public void setCust_cellphone(String cust_cellphone) {
		Cust_cellphone = cust_cellphone;
	}

	public String getCust_addr() {
		return Cust_addr;
	}

	public void setCust_addr(String cust_addr) {
		Cust_addr = cust_addr;
	}

	public String getCust_email() {
		return Cust_email;
	}

	public void setCust_email(String cust_email) {
		Cust_email = cust_email;
	}

	public String getDelivery_addr() {
		return Delivery_addr;
	}

	public void setDelivery_addr(String delivery_addr) {
		Delivery_addr = delivery_addr;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
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
