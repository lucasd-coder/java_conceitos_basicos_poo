package entites;

public class Entities {
	
	public double height;
	public double width;
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double Area() {
		double area = height * width;
		return area;
	}
	
	public double Perimeter() {
		double perimeter = 2 * height + 2 * width;
		return perimeter;
	}
	
	public double Diagonal() {
	 return	Math.sqrt(height * height + width * width);
	}
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void increaseSalary(double percentage) {
		 GrossSalary += GrossSalary * percentage / 100;
	}
	
	public String toString() {
		return Name + ", $" + String.format("%.2f", NetSalary());
	}

}
