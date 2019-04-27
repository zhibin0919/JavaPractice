
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABC";
		String str2 = new String("ABC");
		String str3 = "ABC";
		
		System.out.println(str1 == str2);
		System.out.println(str1.intern() == str3);
		System.out.println(str1.equals(str2));
	}

}
