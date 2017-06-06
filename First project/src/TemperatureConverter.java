
public class TemperatureConverter {

	public static String Convert (int temp, char sys){
		String result;
		double resTemp = 0;
		char sys2 = ' '; 
		
		switch (sys) {
			case 'C' :
				resTemp = temp * 9 / 5 + 32;
				sys2 = 'F';
				break;
			case 'F' :
				resTemp = (temp - 32) * 5 / 9;
				sys2 = 'C';
				break;
		}
		
		result =  "" + temp + '°' + sys + " -> " + resTemp + '°' + sys2;
		
		return result;
	}  
	
	public static void main(String[] args) {
		int temp = 34;
		char sys = 'F';
		String result = TemperatureConverter.Convert (temp, sys);
		System.out.println(result);
		int from = 1000000000;
		int to = 2000000000;
		System.out.println((from + to)/2);
		System.out.println(from/2 + to/2);
		System.out.println(from + (to-from)/2);

	}

}











//if (resTemp < 0){
//	sign = '-';
//} else if (resTemp == 0){
//	sign = ' ';
//} else {
//	sign = '+';
