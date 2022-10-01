package model;

public class Leave {
	
	int employeeId;
	String firstName;
	String lastName;
	int departmentID;
	String startDate;
	String endDate;
	String status;
	
	public Leave() {
		// TODO Auto-generated constructor stub
	}

	public Leave(int employeeId, String firstName, String lastName, int departmentID, String startDate, String endDate,
			String status) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentID = departmentID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	@Override
	public String toString() {
		return "Leave [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", departmentID=" + departmentID + ", startDate=" + startDate + ", endDate=" + endDate + ", status="
				+ status + "]";
	}

	
	

}
