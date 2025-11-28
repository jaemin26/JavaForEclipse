package model;

public class deptVO {
	
	private String deptno;
	private String dname;
	private String loc;
	
	public final String ClassName = "DEPT";

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getClassName() {
		return ClassName;
	}

}
