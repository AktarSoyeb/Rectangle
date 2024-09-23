/**
	 * regular
	 * @author Soyeb Aktar
	 * @description initialization of parameter
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFoundException gevonden
	 **/
public class Triangle {
	
	float a,b,c;
	float h;
	float Area,perimeter;
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	
	/**
	 * regular
	 * @author Soyeb Aktar
	 * @param b h
	 * @return Area of type float
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFoundException gevonden
	 **/
	
	
	public float Area()
	{
		return Area=(float)(0.5)*(b*h);
	}
	
	public float perimeter()
	{
		return perimeter=(float) a+b+c;
	}

}
