package cl.zenta.stackbio.stack.entities;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discipline", schema = "stackBio")
public class Discipline {
	
	private int id;
	private String name;
	private String image;
	private String description;
	private int softdelete;
	private int order;
	private Timestamp created_at;
	
	@Id
    @Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Basic
    @Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic
    @Column(name = "image")
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	@Basic
    @Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Basic
    @Column(name = "softdelete")
	public int getSoftdelete() {
		return softdelete;
	}
	public void setSoftdelete(int softdelete) {
		this.softdelete = softdelete;
	}
	
	@Basic
    @Column(name = "order")
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	@Basic
    @Column(name = "created_at")
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

}
