package $org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit com.pattern.v1.test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the com.pattern.v1.test case
     *
     * @param testName name of the com.pattern.v1.test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
