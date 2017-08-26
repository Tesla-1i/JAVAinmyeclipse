package java201708260806;

public class StaticTest {
	public static void main(String[] args) {
		Employee[] staff=new Employee[3];
		staff[0] = new Employee("Tom",40000);
		staff[1] = new Employee("Dick",60000);
		staff[2] = new Employee("Harry", 65000);
		for(Employee e:staff){
			e.setId();
			System.out.println("name=" +e.getName()+" ,id="+e.getId()
			+",salary="+e.getSalary());
		}
		int n=Employee.getNextId();
		System.out.println("Next available id="+n);
	}

}

class Employee{
	private static int nextId=1;
	private String name;
	private double salary;
	private int id;
	public Employee(String string, int i) {
		name = string;
		salary = i;
		id = 0;
		// TODO Auto-generated constructor stub
	}

	public static int getNextId() {
		// TODO Auto-generated method stub
		return nextId;
	}

	public void setId() {
		// TODO Auto-generated method stub
		id=nextId;
		nextId++;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public static void main(String[] args) {
		Employee employee=new Employee("Harry", 50000);
		System.out.println(employee.getName()+" "+employee.getSalary());
	}
	
}