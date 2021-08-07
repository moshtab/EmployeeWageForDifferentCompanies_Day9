package EmployeeWageForDifferentCompanies;

class Company {

	public static void main(String[] args) {
		EmployeeWage company1 = new EmployeeWage(20, 100, 20);
		EmployeeWage company2 = new EmployeeWage(22, 110, 22);
		EmployeeWage company3 = new EmployeeWage(18, 95, 18);

		System.out.println("Employee Wage of Comapny1 is : " + company1.employeeWage());
		System.out.println("Employee Wage of Comapny2 is : " + company2.employeeWage());
		System.out.println("Employee Wage of Comapny3 is : " + company3.employeeWage());

	}

}
