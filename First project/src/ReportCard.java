
public class ReportCard {

	public static char Convert (int result){
		
		char grade;
		if (result > 90){
			grade = 'A';
		} else if (result > 70){
			grade = 'B';
		} else if (result > 50){
			grade = 'C';
		} else {
			grade = 'D';
		}
		return grade;
	}
	
	public static void main(String[] args) {
		int result = 88;
		char grade = ReportCard.Convert(result);
		switch (grade){
			case 'A' :
				System.out.println("Молодец. Продолжай в том же духе.");
				break;
			case 'B' :
				System.out.println("Неплохо, но ты мог и лучше.");
				break;
			case 'C' :
				System.out.println("Плохо. Тебе нужно подучить эти темы, но три я тебе поставлю.");
				break;
			case'D' :
				System.out.println("Как ты мог?? Приходи на пересдачу в четверг, если не напишешь твои родители будут говорить с директором.");
				break;
		}
	}

}
