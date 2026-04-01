package test1;

public class Main {
	public static void main(String[] args) {
		Delivery rd = new RocketDelivery();
		Delivery sp = new StorePickup();
		
		// rd.printlnvoice();
		// rd.ship();
		// rd.complete();
		// sp.printlnvoice();
		// sp.ship();
		// sp.complete();
		
		Delivery[] array = {new RocketDelivery(),new StorePickup()};
		
		for (Delivery delivery : array) {
			delivery.printlnvoice();
			delivery.ship();
			delivery.complete();
			System.out.println("---------------");
		}
		
	}
}
