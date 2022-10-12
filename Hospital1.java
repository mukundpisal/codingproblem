package codingproblem;

import java.util.LinkedList;
import java.util.Scanner;

public class Hospital1 {

	 int ventilatorBed;
	 int genralbed;

	int n;

	public static void beds(int ventilatorBed, int genralbed) {
		Scanner sc = new Scanner(System.in);
		int totalbed = ventilatorBed + genralbed;
		System.out.println(" Total Beds in Hospital1    :" + totalbed);
		System.out.println(" VentilatorBed in hospital1 :" + ventilatorBed);
		System.out.println(" Genralbed in hospital1    :" + genralbed);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
		String gb[] = new String[totalbed];
		gb[0] = "Vaibhav";
		gb[5] = "Prathamesh";
		gb[6] = "Pratik";
		gb[3] = "Mukund";
		gb[8] = "Pranav";

		System.out.println(" Enter for Ventilator bed : 1");
		System.out.println(" Enter for Genral bed     : 2");

		int s = sc.nextInt();
		if (s == 1) {
		Ventilatorbed(ventilatorBed, gb);
		}
		if(s==2) {
		generalbed(genralbed, gb);
		}

	}

	static void Ventilatorbed(int ventilatorBed, String []gb) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int counts = 0;
		int[] aa = new int[ventilatorBed];
		String a;

		for (int i = 0; i < ventilatorBed; i++) {
			if (gb[i] == null) {
				aa[count] = i;
				count++;

			} else {
				counts++;
				System.out.println(" " + gb[i]);
			}

		}
		System.out.println(" Available Ventilatorbed qty is :" + count);
		System.out.println(" Booked Ventilatorbed bed qty is :" + counts);

		System.out.print(" Available bed is: ");

		for (int i = 0; i < count; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.println();
		

			do {
				System.out.println(" Enter Bed n:");
				int n = sc.nextInt();
				if (n < ventilatorBed) {
					System.out.print(" Enter Name :");

					gb[n] = sc.next();
					count--;
					counts++;

				} else {
					System.out.println(" Choose another Bed ");
				}

				System.out.println(" Continue(Y/N)");
				a = sc.next();
			} while (a.equalsIgnoreCase("Y"));
			System.out.println(" Available Ventilatorbed qty is :" + count);
			System.out.println(" Booked Ventilatorbed bed qty is :" + counts);

			System.out.print(" Available bed is: ");

			for (int i = 0; i < count; i++) {
				System.out.print(aa[i] + " ");
			}

		
	}

	static void generalbed(int genralbed, String []gb) {
		String a;
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int counts = 0;
		int[] aa = new int[genralbed];

		for (int i = 0; i < genralbed; i++) {
			if (gb[i] == null) {
				aa[count] = i;
				count++;

			} else {
				counts++;
				System.out.println(" " + gb[i]);
			}

		}
		System.out.println(" Available Ventilatorbed qty is :" + count);
		System.out.println(" Booked Ventilatorbed bed qty is :" + counts);

		System.out.print(" Available bed is: ");

		for (int i = 0; i < count; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.println();

			do {
				System.out.println(" Enter Bed n:");
				int nn = sc.nextInt();
				if (nn < genralbed) {
					System.out.print(" Enter Name :");

					gb[nn] = sc.next();
					count--;
					counts++;
				} else {
					System.out.println(" Choose another Bed ");
					
				}

				System.out.println(" Continue(Y/N)");
				 a = sc.next();
			} while (a.equalsIgnoreCase("Y"));
			System.out.println(" Available Ventilatorbed qty is :" + count);
			System.out.println(" Booked Ventilatorbed bed qty is :" + counts);

			System.out.print(" Available bed is: ");

			for (int i = 0; i < count; i++) {
				System.out.print(aa[i] + " ");
			}
	}
}
