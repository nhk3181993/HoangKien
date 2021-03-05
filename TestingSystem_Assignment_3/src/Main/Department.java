package Main;

public class Department {
	
	private Integer departmentID;
	
	private String departmentName;

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

	@Override
	public String toString() {
		return "Department \ndepartmentID : " + departmentID + "\ndepartmentName : " + departmentName;
	}

	
	
}
