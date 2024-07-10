package revision4;

public class Emp {

	private String name;
	private int id;
	private int salary;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", gender=" + gender + "]";
	}

	public Emp(String name, int id, int salary, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.gender = gender;
	}

}
