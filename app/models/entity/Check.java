package models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity

@Table(name = "checks")
public class Check extends Model {
	
	@Id
	public Long id;
	
	@Constraints.Required
	public String name;
	
	@Constraints.Required
	public String result;
	
	@Formats.DateTime(pattern="yyyy/MM/dd")
	public Date created;
	
	@Formats.DateTime(pattern="yyyy/MM/dd")
	public Date modified;
	
	//　シリアライズの対象から外す。
	//　このメンバをEbeanの管理対象から外す。
//	@Transient
//	private CheckService checkService = new CheckService();
//	@Transient
//	private CheckModelService checkModelService = new CheckModelService();
//	
//	/**
//	 * 結果を取得
//	 * @return
//	 */
//	public Option<String> result() {
//		return checkService.getResult(name);
//	}
//	
//	/**
//	 * 結果を保存
//	 * @return
//	 */
//	public Option<Check> store() {
//		return checkModelService.save(this);
//	}
//	
//	public Option<Check> unique() {
//		return checkModelService.findById(id);
//	}

	
	public Check() {
		super();
	}
	
	public Check(String name) {
		this.name = name;
	}
	
	public Check(String name, String result) {
		this.name = name;
		this.result = result;
		this.created = new Date();
		this.modified = new Date();
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	

}
