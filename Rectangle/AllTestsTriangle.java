import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTestsTriangle {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTestsTriangle.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(Triangletest1.class);
		suite.addTestSuite(Triangletest2.class);
		//$JUnit-END$
		return suite;
	}

}
