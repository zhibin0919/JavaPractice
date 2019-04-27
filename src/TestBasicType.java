
public class TestBasicType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		
		System.out.println(i1 == i2);
		System.out.println(i1.intValue() == i2);
		System.out.println(i1.equals(i2));
	}

}
