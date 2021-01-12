/**
 * 員工資料表
 * 
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package ims.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class User implements Serializable {

	@Id
	@Column(name="User_id")
	private String User_id;//       nvarchar(50) NOT NULL PRIMARY KEY,
	
	@Column(name="User_name")
	private String User_name;   //nvarchar(50) NULL,
	
	@Column(name="Gender")
	private String Gender;//        char(1) NULL,
	
	@Column(name="Birthday")
	private String Birthday;//      nvarchar(8) NULL,
	
	@Column(name="Email")
	private String Email;//         nvarchar(120) NULL,
	
	@Column(name="Cellphone")
	private String Cellphone;//     nvarchar(15) NULL,
	
	@Column(name="Address")
	private String Address;//       nvarchar(200) NULL,
	
	@Column(name="Pwd")
	private String Pwd;//           nvarchar(70) NULL,
	
	@Column(name="On_job_date")
	private String On_job_date;//   nvarchar(8) NULL,
	
	@Column(name="Off_job_date")
	private String Off_job_date;//  nvarchar(8) NULL,
	
	@Column(name="Figure")
	private byte[] Figure;//        Varbinary(max) NULL,
	
	@Column(name="Crt_time")
	private Timestamp Crt_time;//      datetime NOT NULL,
	
	@Column(name="Upd_time")
	private Timestamp Upd_time;//      datetime NOT NULL
	
	
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCellphone() {
		return Cellphone;
	}
	public void setCellphone(String cellphone) {
		Cellphone = cellphone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	public String getOn_job_date() {
		return On_job_date;
	}
	public void setOn_job_date(String on_job_date) {
		On_job_date = on_job_date;
	}
	public String getOff_job_date() {
		return Off_job_date;
	}
	public void setOff_job_date(String off_job_date) {
		Off_job_date = off_job_date;
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
