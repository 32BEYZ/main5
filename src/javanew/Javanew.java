package javanew;

public class Javanew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String mesaj = " bugun hava çok güzel.";
		System.out.println(mesaj);  
		
		System.out.println("Eleman sayısı : "+mesaj .length());
		 System.out.println("5.eleman : "+mesaj.charAt(5));
		 System.out.println(mesaj.concat(" yaşasın?"));
		 
		System.out.println(mesaj.startsWith(" "));
		System.out.println(mesaj.endsWith(".")); 
		
		  char[] karakterler = new char[10];
	        mesaj.getChars(0,6,karakterler,0);
	        System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("ha"));
		System.out.println(mesaj.lastIndexOf("e"));
		
		

	}

}
