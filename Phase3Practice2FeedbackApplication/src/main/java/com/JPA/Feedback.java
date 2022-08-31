package com.JPA;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	private String fedbk;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFedbk() {
		return fedbk;
	}
	public void setFedbk(String fedbk) {
		this.fedbk = fedbk;
	}

}
