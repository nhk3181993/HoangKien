package JAVA.Entity;

public class Employee extends User{
	private int projectId;
	private String proSkill;
	
	public Employee() {
		super();
	}

	public Employee(int projectId, String proSkill) {
		super();
		this.projectId = projectId;
		proSkill = proSkill;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		proSkill = proSkill;
	}

	@Override
	public String toString() {
		return "\nProjectId : " + projectId + "\nProSkill : " + proSkill;
	}
	
	
}
