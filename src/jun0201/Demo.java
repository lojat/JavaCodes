package jun0201;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Address a1 = new Address();
		
		e1.setEmpId(001);
		e1.setEmpName("Akash");
		a1.setCity("bhopal");
		a1.setPincode(462026);
		a1.setState("MP");
		e1.setAdd(a1);
		
		
		System.out.println(e1.toString());
		
	}

}
