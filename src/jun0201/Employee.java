package jun0201;

public class Employee {

	private int empId;
	private String empName;
	private Address add;
	
	public Employee()
	{
		System.out.println("Default");
	};
	
	public Employee(int empId, String empName, Address add) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.add = add;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Add=" + add + "]";
	}
	
	
	
}
