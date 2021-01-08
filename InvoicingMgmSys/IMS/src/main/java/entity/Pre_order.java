/**
 * 預購訂單資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Pre_order implements Serializable {

	@Id
	@Column(name="")
	private String Pre_order_id;//   nvarchar(50) NOT NULL PRIMARY KEY,

	@Column(name="")
    private String Status;//         varchar(2) NULL,

	@Column(name="")
    private String Cust_id;//        nvarchar(50) NULL,

	@Column(name="")
    private String Pre_cust_name;//  nvarchar(50) NULL,

	@Column(name="")
    private String Pre_cellphone;//  nvarchar(15) NULL,

	@Column(name="")
    private String Pre_addr;//       nvarchar(200) NULL,

	@Column(name="")
    private Integer Pre_count;//      int NULL,

	@Column(name="")
    private Double Pre_all_price;//  decimal(11,2) NULL,

	@Column(name="")
    private String Pre_date;//       nvarchar(8) NULL,
	
    @Column(name="Crt_time")
    private Timestamp Crt_time;//     datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//       datetime NOT NULL,

	public String getPre_order_id() {
		return Pre_order_id;
	}

	public void setPre_order_id(String pre_order_id) {
		Pre_order_id = pre_order_id;
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

	public String getPre_cust_name() {
		return Pre_cust_name;
	}

	public void setPre_cust_name(String pre_cust_name) {
		Pre_cust_name = pre_cust_name;
	}

	public String getPre_cellphone() {
		return Pre_cellphone;
	}

	public void setPre_cellphone(String pre_cellphone) {
		Pre_cellphone = pre_cellphone;
	}

	public String getPre_addr() {
		return Pre_addr;
	}

	public void setPre_addr(String pre_addr) {
		Pre_addr = pre_addr;
	}

	public Integer getPre_count() {
		return Pre_count;
	}

	public void setPre_count(Integer pre_count) {
		Pre_count = pre_count;
	}

	public Double getPre_all_price() {
		return Pre_all_price;
	}

	public void setPre_all_price(Double pre_all_price) {
		Pre_all_price = pre_all_price;
	}

	public String getPre_date() {
		return Pre_date;
	}

	public void setPre_date(String pre_date) {
		Pre_date = pre_date;
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
