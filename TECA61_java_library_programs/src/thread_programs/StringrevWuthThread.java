package thread_programs;

public class StringrevWuthThread extends Thread {
	//WAPT reverse a string ny using threads
	@Override
	public void run() {
		String s = "JAVA";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char charAt = s.charAt(i);
			s1 += charAt;
		}
		System.out.println(s1);
	}
}
