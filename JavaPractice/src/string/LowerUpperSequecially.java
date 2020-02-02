package string;

public class LowerUpperSequecially {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		s=s.toLowerCase();
		String t="";
		
		int i=1, pos=0;
		while (pos< s.length()) {		
			for (int j =0 ; j < i; j++) {
				if(i%2!=0)
				{
					char ch=Character.toUpperCase(s.charAt(pos)); 
					t+=ch;
					pos++;
				}else {
					t+=s.charAt(pos);
					pos++;
				}
				if(pos==s.length())
				{	break;}
			}
			i++;
		}
		System.out.println(t+"\n"+s);
	}

}
