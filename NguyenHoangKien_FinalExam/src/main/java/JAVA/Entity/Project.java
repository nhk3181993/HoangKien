package JAVA.Entity;

import java.util.List;

public class Project {
	private int projectId;
	private int teamSize;
	private Manager manager;
	private List<Employee> employees;
	
	public Project() {
		super();
	}

	public Project(int projectId, int teamSize, Manager manager, List<Employee> employees) {
		super();
		this.projectId = projectId;
		this.teamSize = teamSize;
		this.manager = manager;
		this.employees = employees;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
