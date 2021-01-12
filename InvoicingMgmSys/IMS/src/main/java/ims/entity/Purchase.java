/**
 * 進貨資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package ims.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Purchase implements Serializable {

	@Id
	@Column(name="Pur_id")
	private String Pur_id;//            nvarchar(50) NOT NULL PRIMARY KEY,

	@Column(name="Pur_supplier_id")
	private String Pur_supplier_id;//   nvarchar(50) NULL,

	@Column(name="Pur_supplier_name")
    private String Pur_supplier_name;// nvarchar(50) NULL,

	@Column(name="Pur_supplier_tel")
    private String Pur_supplier_tel;//  nvarchar(15) NULL,

	@Column(name="Pur_num")
    private String Pur_num;//           nvarchar(50) NULL,

	@Column(name="Pur_count")
    private Integer Pur_count;//         int NULL,

	@Column(name="Pur_all_price")
    private Double Pur_all_price;//     decimal(11,2) NULL,

	@Column(name="Pur_date")
    private String Pur_date;//          nvarchar(8) NULL,
	
    @Column(name="Crt_time")
    private Timestamp Crt_time;//       datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//       datetime NOT NULL

	public String getPur_id() {
		return Pur_id;
	}

	public void setPur_id(String pur_id) {
		Pur_id = pur_id;
	}

	public String getPur_supplier_id() {
		return Pur_supplier_id;
	}

	public void setPur_supplier_id(String pur_supplier_id) {
		Pur_supplier_id = pur_supplier_id;
	}

	public String getPur_supplier_name() {
		return Pur_supplier_name;
	}

	public void setPur_supplier_name(String pur_supplier_name) {
		Pur_supplier_name = pur_supplier_name;
	}

	public String getPur_supplier_tel() {
		return Pur_supplier_tel;
	}

	public void setPur_supplier_tel(String pur_supplier_tel) {
		Pur_supplier_tel = pur_supplier_tel;
	}

	public String getPur_num() {
		return Pur_num;
	}

	public void setPur_num(String pur_num) {
		Pur_num = pur_num;
	}

	public Integer getPur_count() {
		return Pur_count;
	}

	public void setPur_count(Integer pur_count) {
		Pur_count = pur_count;
	}

	public Double getPur_all_price() {
		return Pur_all_price;
	}

	public void setPur_all_price(Double pur_all_price) {
		Pur_all_price = pur_all_price;
	}

	public String getPur_date() {
		return Pur_date;
	}

	public void setPur_date(String pur_date) {
		Pur_date = pur_date;
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
