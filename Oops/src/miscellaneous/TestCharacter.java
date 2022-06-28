package miscellaneous;

public class TestCharacter {

	public static void main(String[] args) {
		   int count;
	        char[] values = {'*', '7', 'p', ' ', 'P'};

	 

	        for (count = 0; count < values.length; count++) 
	        {
	            if (Character.isDigit(values[count])) 
	            {
	                System.out.println(values[count] + " is a digit");
	            } 
	            if (Character.isLetter(values[count])) 
	            {
	                System.out.println(values[count] + " is a letter");
	            } 
	            if (Character.isUpperCase(values[count])) 
	            {
	                System.out.println(values[count] + " is uppercase");
	            } 
	            if(Character.isUnicodeIdentifierStart(values[count])) 
	            {
	                System.out.println(values[count] + " is valid first"
	                        + "character of Unicode identifier");
	            }
	        }

	}

}
