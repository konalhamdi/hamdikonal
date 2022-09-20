package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // yorum satırıdır.
	    System.out.println("Hello World");
	    //String: Metin (; ile bitmeli)
	    //değişken isimlendirmeleri java'da camelCase yazılır. camelCase ilk metin küçük harf 2.metin büyük hafle başlar.
	    String ortaMetin = "İlginizi Çekebilir";
	    String altMetin = " Vade Süresi";
	    System.out.println(ortaMetin);
	    //int: integer (tam sayı)
	    int	vade = 12 ;
	    // double ondalıklı sayı
	    double	dolarDun = 18.20;
	    double dolarBugun = 18.20;
	    
	    boolean	dolarDustumu = false;
	    
	    
	    String okYonu = "";
	    
	    
	    if (dolarBugun<dolarDun) { //true
	    	okYonu = "down.svg";
	    	System.out.println(okYonu);
	    	
		} else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
	    	System.out.println(okYonu);
		}
	    
	    else {
			okYonu = "equal.svg";
	    	System.out.println(okYonu);
	    	
	    	//array listeli veriler
	    	String [] krediler = {"Hızlı Kredi" , "Maaşını Halkbanktan" , "Mutlu emekli"};
	    	System.out.println(krediler[0]);
	    	
	    	//for bir çok listelenmiş verileri saydırmak için kullanılır.
	        
	    	for (int i = 0; i < krediler.length; i++) {
	    		System.out.println(krediler[i]);
	    		
			}
	    	
	    
	    }
	   
	}

}
