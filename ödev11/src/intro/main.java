package intro;

public class main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı :" + mesaj.length());//toplam karakter sayısını yazdırır.
		System.out.println("5.eleman: " + mesaj.charAt(4));//aranılan karakter sayısındaki elemanı yazdırır.
		System.out.println(mesaj.concat(" Yaşasın!"));//metne ekleme yapılabilir.
		System.out.println(mesaj.startsWith("b"));//boolean a göre başlangıç karakteri true/false olarak değerlendiri.caseSensitive
		System.out.println(mesaj.endsWith("."));//boolean a göre bitiş karakteri true/false olarak değerlendiri.caseSensitive
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);// seçilen aralıktaki karakterleri yazdırır.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));//karakteri soldan saydırarak kaçıncı karakter olduğunu yazdırır.
		System.out.println(mesaj.lastIndexOf("a"));//karakteri sağdan itibaren saydırarak kaçıncı karakter olduğunu söyler
		System.out.println("------------------------------------");

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(mesaj.replace(' ', '-'));//seçilen karakter yerine başka karakter yazdırmak için kullanılır.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));//yazılan karakterden itibaren yazdırır
		System.out.println(mesaj.substring(2, 4));//aralıktaki karakterleri yazdırır
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);//kelimelere ayırabilir
		}
	    System.out.println(mesaj.toLowerCase());//karakterleri küçük harfe çevirir
	    System.out.println(mesaj.toUpperCase());//karakterleri büyük harfe çevirir
	    System.out.println(mesaj.trim());//başında ve sonundaki boşlukları siler
		

	}

}
