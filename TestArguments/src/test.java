public class test {
	
	public static void main(String[] args) {
		
		// Сколько получено аргументов?
		int numberOfArgs = args.length;
		for (int i=0; i<numberOfArgs; i++){
			System.out.println("I’ve got " + args[i]);
		}
	}
}