package com.training.model.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="trainee_table")
public class TraineeMgmt {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int trainee_id;
	private String trainee_name;
	private String branch;
	private Double percentage;

	public TraineeMgmt() {

	}

	public TraineeMgmt(int trainee_id, String trainee_name, String branch, Double percentage) {
		this.trainee_id = trainee_id;
		this.trainee_name = trainee_name;
		this.branch = branch;
		this.percentage = percentage;
	}

	public TraineeMgmt(int id, int trainee_id, String trainee_name, String branch, Double percentage) {
		this.id = id;
		this.trainee_id = trainee_id;
		this.trainee_name = trainee_name;
		this.branch = branch;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrainee_id() {
		return trainee_id;
	}

	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}

	public String getTrainee_name() {
		return trainee_name;
	}

	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TraineeMgmt [id=");
		builder.append(id);
		builder.append(", trainee_id=");
		builder.append(trainee_id);
		builder.append(", trainee_name=");
		builder.append(trainee_name);
		builder.append(", branch=");
		builder.append(branch);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}

}
