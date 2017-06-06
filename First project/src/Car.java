
public class Car {
	public void start(){
		System.out.println("Поехаали!!");
	}
	
	public void stop(){
		System.out.println("Тормозиим!");
	}
	
	public int drive(int howLong){
		int distance = howLong * 60;
		return distance;
	}
}
