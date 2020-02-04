package string;


/*
 * at least 6 character contains at least 1 number, 1 special character, 1 upper, 1 lower case letter
 numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
 */
public class StrongPasswordCheck {
	static int minimumNumber(int n, String password) {
	    // Return the minimum number of characters to make the password strong
	    int len = password.length();
	    String specials = "!@#$%^&*()-+";
	    boolean small = false, caps = false, numeric = false, special = false;
	    for(int i=0; i < len; i++) {
	        if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
	            small = true;
	        if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
	            caps = true;
	        if(password.charAt(i) >= '0' && password.charAt(i) <= '9')
	            numeric = true;
	        if(specials.indexOf(Character.toString(password.charAt(i))) != -1)
	            special = true;
	    }
	    int ans = 0;
	    if(!small) ans++;
	    if(!caps) ans++;
	    if(!numeric) ans++;
	    if(!special) ans++;
	    if(len + ans < 6) ans+= 6-(len+ans);
	    return ans;
	}
	static int minimumNumber2(int n, String password) {
	    // Return the minimum number of characters to make the password strong
	    int len = password.length();
	    String specials = "!@#$%^&*()-+";
	    boolean small = false, caps = false, numeric = false, special = false;
	    for(int i=0; i < len; i++) {
	        if(Character.isLowerCase(password.charAt(i)))
	            small = true;
	        if(Character.isUpperCase(password.charAt(i)))
	            caps = true;
	        if(Character.isDigit(password.charAt(i)))
	            numeric = true;
	        if(specials.indexOf(password.charAt(i)) != -1)
	            special = true;
	    }
	    int ans = 0;
	    if(!small) ans++;
	    if(!caps) ans++;
	    if(!numeric) ans++;
	    if(!special) ans++;
	    if(len + ans < 6) ans+= 6-(len+ans);
	    return ans;
	}
	public static void main(String[] args) {
       String password = "tanmh%ann";
       int n=password.length();

        int answer = minimumNumber2(n, password);

        System.out.println("Remaining letter required for strong: "+answer);
    }

}
