
class Fish extends Pet{

	int depth = 0;
	public int dive(int howDeep) {
		
		depth += howDeep;
		if (depth > 100) {
			System.out.println("я маленький рыбк, не способный нырять больше чем на 100 м");
			depth = 100;
		} else {
		System.out.println("Ныряю на " + howDeep + " [метры]");
		System.out.println("Я на глубине : " + depth + " [метры]!");
		}
		return depth;
		
	}
	public String say(String smth) {
		
		return "Я не могу разговаривать!!";
	}

}
