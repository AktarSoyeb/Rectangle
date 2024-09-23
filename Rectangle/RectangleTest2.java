import junit.framework.TestCase;

public class RectangleTest2 extends TestCase
{
	public void testPerimeterPositive1()
	{
		NewRectangle r = new NewRectangle();
		r.setLength(2);
		r.setBreadth(2);
		float P = r.perimeter();
		assertEquals((float) 8,P);
	}
	
	public void testPerimeterPositive2()
	{
		NewRectangle r = new NewRectangle();
		r.setLength(5);
		r.setBreadth(3);
		float val = r.getBreadth();
		System.out.print(val);
		float P = r.perimeter();
		assertEquals(val,(float)3);
	}
	
	public void testPerimeterNegative1()
	{
		NewRectangle r = new NewRectangle();
		r.setLength(2);
		r.setBreadth(5);
		float P = r.perimeter();
		assertEquals((float) 9,P);
	}
	
	public void testPerimeterNegative2()
	{
		NewRectangle r = new NewRectangle();
		r.setLength(7);
		r.setBreadth(1);
		float P = r.perimeter();
		assertEquals((float) 24,P);
	}
}
