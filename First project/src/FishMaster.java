
public class FishMaster {


	public static void main(String[] args) {

		Fish myFish = new Fish();
		myFish.dive(2);
		myFish.dive(100);
		myFish.dive(-5);
		System.out.println(myFish.say("кря"));
		myFish.sleep();
	}

}
