/**
 * 程序資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Program implements Serializable {

	@Id
	@Column(name="Program_id")
	private String Program_id;//    nvarchar(50) NOT NULL PRIMARY KEY,

	@Column(name="Program_name")
    private String Program_name;//  nvarchar(50) NULL,

	@Column(name="Status")
    private String Status;//        varchar(2) NULL,

	@Column(name="Layer")
    private String Layer;//         nvarchar(2) NULL,

	@Column(name="Uri")
    private String Uri;//           nvarchar(20) NULL,

	@Column(name="Crt_time")
    private Timestamp Crt_time;//      datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//      datetime NOT NULL

	public String getProgram_id() {
		return Program_id;
	}

	public void setProgram_id(String program_id) {
		Program_id = program_id;
	}

	public String getProgram_name() {
		return Program_name;
	}

	public void setProgram_name(String program_name) {
		Program_name = program_name;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getLayer() {
		return Layer;
	}

	public void setLayer(String layer) {
		Layer = layer;
	}

	public String getUri() {
		return Uri;
	}

	public void setUri(String uri) {
		Uri = uri;
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
