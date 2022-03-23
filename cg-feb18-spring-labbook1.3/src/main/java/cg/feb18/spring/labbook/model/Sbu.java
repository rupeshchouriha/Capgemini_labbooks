package cg.feb18.spring.labbook.model;

import java.util.List;

public class Sbu {

	private int sbuCode;
	private String sbuName;
	private String sbuHead;
	private List<Employee> emp;

	public int getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public void getSbuDetails() {
		System.out.println("Sbu Id :" + sbuCode);
		System.out.println("Sbu Name :" + sbuName);
		System.out.println("Sbu head :" + sbuHead);
		System.out.println("----------------------------Employee details-----------------------");
		System.out.println("Employee :" + emp);
	}

}
