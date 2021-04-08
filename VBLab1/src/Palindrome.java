public class Palindrome {
 public static void main(String[] args) {
	  for (String word : args) {
          if (word.equals(reverseString(word))) {
              System.out.println(String.format("%s является палиндромом", word));
          } else {
              System.out.println(String.format("%s не является палиндромом", word));
          }
      }
  }
 public static String reverseString(String text) {
	  String result = "";
	  for (int i = 0; i < text.length(); i++) {
	     result = text.charAt(i) + result;
	  }
	  return result;
	}
 public boolean isPalindrome(String text) {
	    StringBuilder reverse = new StringBuilder();
	    String clean = text.replaceAll("\\s+", "").toLowerCase();
	    char[] plain = clean.toCharArray();
	    for (int i = plain.length - 1; i >= 0; i--) {
	        reverse.append(plain[i]);
	    }
	    return (reverse.toString()).equals(clean);
	}
}