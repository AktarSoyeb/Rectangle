import junit.framework.TestCase;

public class RectangleTest1 extends TestCase 
{
	
	public void testAreaPositive1()
	{  
		NewRectangle R = new NewRectangle();  
		R.setLength(2);  
		R.setBreadth(5);  
		float p = R.area();
		assertEquals((float) 10,p);  
	} 

	public void testAreaPositive2() 
	{ 
		NewRectangle R = new NewRectangle(); 
		R.setLength(6);
		R.setBreadth(6); 
		float p = R.area();  
		assertEquals((float) 36,p);  
	}
	
	public void testAreaNegative1()  
	{  
		NewRectangle R = new NewRectangle(); 
		R.setLength(7);  
		R.setBreadth(1);  
		float p = R.area();
		assertEquals((float) 28,p);  
	} 
	 
	public void testAreaNegative2() 
	{
		NewRectangle R = new NewRectangle();
		R.setLength(5);
		R.setBreadth(3);
		float p = R.area();
		assertEquals( (float) 32,p);
	}	
}
