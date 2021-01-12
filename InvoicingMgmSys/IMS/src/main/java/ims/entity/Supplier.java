/**
 * 廠商資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package ims.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Supplier implements Serializable {

	@Id
	@Column(name="Supplier_id")
	private String Supplier_id;//    nvarchar(50) NOT NULL PRIMARY KEY,

	@Column(name="Supplier_name")
    private String Supplier_name;//  nvarchar(50) NULL,

	@Column(name="Contact")
    private String Contact;//        nvarchar(50) NULL,

	@Column(name="Supp_tel")
    private String Supp_tel;//       nvarchar(15) NULL,

	@Column(name="Supp_cellphone")
    private String Supp_cellphone;// nvarchar(15) NULL,

	@Column(name="Supp_addr")
    private String Supp_addr;//      nvarchar(200) NULL,

	@Column(name="Unify")
    private String Unify;//          nvarchar(15) NULL,

	@Column(name="Email")
    private String Email;//          nvarchar(120) NULL,

	@Column(name="Figure")
    private byte[] Figure;//         varbinary(max) NULL,

	@Column(name="Crt_time")
    private Timestamp Crt_time;//     datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//       datetime NOT NULL,

	public String getSupplier_id() {
		return Supplier_id;
	}

	public void setSupplier_id(String supplier_id) {
		Supplier_id = supplier_id;
	}

	public String getSupplier_name() {
		return Supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		Supplier_name = supplier_name;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String getSupp_tel() {
		return Supp_tel;
	}

	public void setSupp_tel(String supp_tel) {
		Supp_tel = supp_tel;
	}

	public String getSupp_cellphone() {
		return Supp_cellphone;
	}

	public void setSupp_cellphone(String supp_cellphone) {
		Supp_cellphone = supp_cellphone;
	}

	public String getSupp_addr() {
		return Supp_addr;
	}

	public void setSupp_addr(String supp_addr) {
		Supp_addr = supp_addr;
	}

	public String getUnify() {
		return Unify;
	}

	public void setUnify(String unify) {
		Unify = unify;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public byte[] getFigure() {
		return Figure;
	}

	public void setFigure(byte[] figure) {
		Figure = figure;
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
