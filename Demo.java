package strings.Demo;

public class Demo {
	public static void main(String[] args) {
		String s1 =" Raja Ram Mohan Roy ";
		System.out.println(s1.length());
		System.out.println(s1.charAt(10));
		System.out.println(s1.indexOf("Mo"));
		System.out.println(s1.lastIndexOf('R'));
		System.out.println(s1.concat(" is a good manager"));
		System.out.println(s1.startsWith("aj"));
		System.out.println(s1.endsWith("Roy"));
		System.out.println(s1.indexOf("am", 2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace("Ram", "Sita"));
		System.out.println(s1.replace("o", "y"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.substring(9));
		System.out.println(s1.substring(3, 9));
		System.out.println(s1);
		System.out.println(s1.trim());
		String s2 = " raja ram mohan roy ";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both string are equal");
		}
		else {
			System.out.println("Both string are not equal");
		}
		System.out.println(s1.equals(s2));
	}

}
