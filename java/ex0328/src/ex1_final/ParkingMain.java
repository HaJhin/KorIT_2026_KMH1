package ex1_final;

import java.util.Scanner;

public class ParkingMain {
	public static void main(String[] args) {
		Parking parking = new Parking();
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		System.out.println("주차 요금 : " + parking.parkingPee(hour));
	}
}
