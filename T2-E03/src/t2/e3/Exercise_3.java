package t2.e3;
public class Exercise_3 {

	public static void main(String[] args) {
		long a = 4L;    //количество гигабайт
	    
		long b = 1024L;
			
		 
		long Mb = a * b;
			   
		long kb = a * b * b;
			   
		long byt = a * b * b * b;
		        
		System.out.println("байт = " + byt);
		        
		System.out.println("Килобайт = " + kb);
		        
		System.out.println("Мегабайт = " + Mb);
		        
		System.out.println("Гигабайт = " + a);
		
	}

}
