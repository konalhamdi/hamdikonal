package intro;

public class main {

	public static void main(String[] args) {
		int number =1;
		
		int remainder = number%number;
		boolean isPrime=true;
		if(number<1) {
			System.out.println("geçersiz sayı");
			return;
		}
		if(number==1) {
			System.out.println("Asal sayı değildir.");
			return;
			
		}
		for(int i = 2; i<number; i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
			if(isPrime==true ) {
				System.out.println("Asal Sayıdır.");
			
			}else {
				System.out.println("Asal Sayı Değildir.");
			}
	}

}
