package assignments;

public class employee {
	String name;
	int emp_id;
	static String Company;
	
	public employee()
	{
		
	}
	public employee(String name, int emp_id)
	{
		this.name = name;
		this.emp_id = emp_id;
	}
	public employee(String name)
	{
		this.name = name;
	}
	public void setcompany(String company)
	{
		this.Company = company;
	}
	public String getname()
	{
		return this.name;
	}
	public int getempid()
	{
		return this.emp_id;
	}
	public String getcompany()
	{
		return this.Company;
	}
}
