
public class PetMaster {

	public static void main(String[] args) {

		String petReaction;
		Pet myPet = new Pet();
		myPet.eat();
		petReaction = myPet.say("Спасибо за еду, человек.");
		System.out.println(petReaction);
		myPet.sleep();
	}

}
