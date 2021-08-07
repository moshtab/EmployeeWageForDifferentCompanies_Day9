package EmployeeWageForDifferentCompanies;

import java.util.Random;

public class EmployeeWage {

	public static void calculatingWage() {
		int workingHr = 0;
		int empWage = 0;
		int wagePerHr = 20;
		Random r = new Random();
		int empCheck = r.nextInt(3);
		switch (empCheck) {
		case 0: {
			System.out.println("Employee is present");
			workingHr = 8;
			break;
		}
		case 1: {
			System.out.println("Employee is partTime");
			workingHr = 4;
			break;
		}
		case 2: {
			System.out.println("Employee is absent");
			workingHr = 0;
			break;
		}
		}
		empWage = empWage + (workingHr * wagePerHr);
		System.out.println("Employee wage is : " + empWage);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Computation Program");
		calculatingWage();

	}

}
