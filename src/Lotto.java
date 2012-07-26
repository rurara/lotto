import java.util.Random;

//import org.omg.CORBA.PRIVATE_MEMBER;

public class Lotto {

	/**
	 * @param args
	 */
	static Random random = new Random();

	public static void main(String[] args) {
		new Lotto().getLotto();
	}
	
	public int[] getLotto() {
		
		int[] numbers = new int[5];
		
		for (int i = 0; i <=6; i++){
//			if (numbers[i] != getNumber()){
				numbers[i] = getNumber();
//			}
			System.out.println(getNumber());
		}
		return numbers;
	}
	
	private static int getNumber(){
		return random.nextInt(45) + 1;
	}
}
