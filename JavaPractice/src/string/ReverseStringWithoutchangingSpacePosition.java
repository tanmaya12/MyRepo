package string;

public class ReverseStringWithoutchangingSpacePosition {

	public static void main(String[] args) {
		String s = "Tanmaya Kumar Behera"; //
		StringBuilder sb = new StringBuilder(s.replaceAll(" ", ""));

		// count while spaces
		long count = s.chars().filter(c -> c == (int) ' ').count();
		// long count2 = s.chars().filter(Character::isWhitespace).count();
		// System.out.println(count2);

		int pos[] = new int[(int) count];
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
				pos[cnt] = i;
				cnt++;
			}
		}
		System.out.println(s);
		sb = sb.reverse();
		for (int i = 0; i < pos.length; i++) {
			sb.insert(pos[i], ' ');
		}

		// sb.insert(0, "8");
		System.out.println(sb.toString());

	}

	int countSpace(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
