import junit.framework.TestCase;

public class Triangletest1 extends TestCase {

	public void TestArea1() {
		//fail("Not yet implemented");
		Triangle T1= new Triangle();  
		T1.setB(2);  
		T1.setH(5);
		T1.setA(3);
		T1.setC(2);
		float d = T1.Area();
		assertEquals((float) 10,d);  
	}
	
	public void TestArea2() {
		//fail("Not yet implemented");
		Triangle T1= new Triangle();  
		T1.setB(3);  
		T1.setH(9);
		T1.setA(3);
		T1.setC(3);
		float d = T1.Area();
		assertEquals((float) 13.5,d);  
	}

}
