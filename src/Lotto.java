import java.util.Random;

//import org.omg.CORBA.PRIVATE_MEMBER;

public class Lotto {

	/**
	 * @param args
	 */
	static Random random = new Random();
	public static void main(String[] args) {

//		int[] print = new int[ ] {0, 0, 0, 0, 0, 0};
		new Lotto().printLotto();
		
		
	}
	public void printLotto() {
		for (int i = 0; i <=6; i++){
//			if (print[i] != getNumber()){
//				print[i] = n1;
//			}
			System.out.println(getNumber());
		}
	}
	private static int getNumber(){
		return random.nextInt(45) + 1;
	}
}
