package maven.PSR;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        //Remove the code
    }

    /**
     * @return the suite of tests being tested
     */
   // public static Test suite()
    {
    	//Helloo
       // return new TestSuite( AppTest.class );
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
        assertTrue( true );
    }
    
    @Test
	public void test() {
		App obj = new App();
        assertEquals("Hello mkyong", obj.getMessage("mkyong"));
        
	}
    public void testblank() {
		App obj = new App();
        assertEquals("Please provide a name!", obj.getMessage(""));
        
	}
    
    @Test
    public void test1() {
		App obj = new App();
        assertEquals(4+3,7);
        
	}
}
