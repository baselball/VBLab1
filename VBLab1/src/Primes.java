public class Primes {
 public static void main(String[] args) {
	    {		
	        int i =0;
	        boolean d = true;
	        String  primesString = "";
	        for (i = 2; i <= 100; i++)         
	        { 		  	  
	          d = isPrime(i);
	          if(d){
	        	  primesString = primesString + i + " ";
	          }
	        }
	        System.out.println("Простые числа от 1 до 100:");
	        System.out.println(primesString);
	    }
	 }
 public static boolean isPrime(int n) {
     int c = 1;
     for (int i = 2; i <= (int)n / 2; i++)
         if (n % i == 0) c++;
     return c == 1;
}
}
