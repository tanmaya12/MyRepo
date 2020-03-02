package string;

public class IndexOf_Method {

	public static void main(String[] args) {
		String st="TanmayaKumar";
		String s= st.substring(st.indexOf("K"), st.length());
		//System.out.println(s+" "+ st.indexOf("K"));
		for (int i = 2; i <= s.length(); i++) {
			System.out.println(s.substring(s.indexOf("K"), i));
		}
	}
}
