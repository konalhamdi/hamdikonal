package intro;

public class main {

	public static void main(String[] args) {
		int sayi1 = 225;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}

		}
		for (int j = 1; j < sayi2; j++) {
			if (sayi2 % j == 0) {
				toplam2 = toplam2 + j;
			}
		}
		if (sayi1 == toplam2) {
			if (sayi2 == toplam1) {
				System.out.println("Bu sayılar arkadaştır.");
			}
		} else {
			System.out.println("Bu sayılar arkadaş değildir.");
		}
	}

}
