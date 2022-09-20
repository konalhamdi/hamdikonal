package intro;

public class main {

	public static void main(String[] args) {
		char harf='A';
		
		switch (harf) {
		case 'A':
		case 'I':
		case'O':
		case'U':
			System.out.println("Kalın Sesli Harf");
			break;
		case'E':
		case'İ':
		case'Ü':
		case'Ö':
			System.out.println("İnce Sesli Harf");
			break;
			default:
				System.out.println("Lütfen Sesli Harf Giriniz");
		}

	}

}
