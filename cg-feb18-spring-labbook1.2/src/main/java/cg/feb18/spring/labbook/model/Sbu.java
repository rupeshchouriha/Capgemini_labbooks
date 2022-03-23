package cg.feb18.spring.labbook.model;

public class Sbu {

	private int sbuCode;
	private String sbuName;
	private String sbuHead;

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

	@Override
	public String toString() {
		return "Sbu [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	

}
