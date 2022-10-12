package codingproblem;

import java.util.Scanner;

public class City {
	
	String City;
	Hospital1 hospital1;
	Hospital2 hospital2;

	public City(String city)
	{		super();

		Scanner sc = new Scanner(System.in);
		this.City = city;
		System.out.println("City : "+city);
		System.out.println("Hospital1 for press 1 ");
		System.out.println("Hospital2 for press 2 ");
		int n = sc.nextInt();
		if(n==1) {
			codingproblem.Hospital1.beds(10, 10);
		}
		if(n==2) {
		codingproblem.Hospital2.beds(15, 15);
		}


		

	}
	
	
	

}
