package Exercise5;
public class HashUtilities{
	
	
	public static int shortHash(int num){
		num = Math.abs(num);
		while (num <= 1000){
			num *= (int) (Math.random() * 113);
		}
		while (num > 1000){
			num /= 11;
			num *= 3;
		}
		return num;
	}
}