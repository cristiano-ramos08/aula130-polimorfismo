package entities;

public class Employee {
	
	private String name;
	private Integer hours;
	private Double valuePerhour;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, double valuePerhour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerhour = valuePerhour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double getValuePerhour() {
		return valuePerhour;
	}

	public void setValuePerhour(double valuePerhour) {
		this.valuePerhour = valuePerhour;
	}
	
	public double payment() {
		return hours * valuePerhour;
	}
}	
