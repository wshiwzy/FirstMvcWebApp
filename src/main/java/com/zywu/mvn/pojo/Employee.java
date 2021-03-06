package com.zywu.mvn.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long employeeId;

	private String name;

	private Integer age;

	private Boolean enable;

	private String address;

	private String tel;

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(Boolean isEnable) {
		this.enable = isEnable;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
