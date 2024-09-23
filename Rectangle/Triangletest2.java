import junit.framework.TestCase;

public class Triangletest2 extends TestCase {

	public void testPerimeter1() {
		//fail("Not yet implemented");
		Triangle T2= new Triangle();  
		T2.setB(2);  
		T2.setH(5);
		T2.setA(3);
		T2.setC(2);
		float k = T2.perimeter();
		assertEquals((float) 7,k);
	}
	
	public void testPerimeter2() {
		//fail("Not yet implemented");
		Triangle T2= new Triangle();  
		T2.setB(5);  
		T2.setH(3);
		T2.setA(7);
		T2.setC(2);
		float k = T2.perimeter();
		assertEquals((float) 15,k);
	}
	

}
