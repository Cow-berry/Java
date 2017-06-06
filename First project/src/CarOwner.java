
public class CarOwner {

	public static void main(String[] args) {
		JamesBondCar myCar = new JamesBondCar();
		myCar.start();
		System.out.println("Мы проехали " + myCar.drive(6) + " км!");
		myCar.stop();
		
	}

}
