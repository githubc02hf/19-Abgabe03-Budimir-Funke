package at.fhj.iit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
      assertTrue(s.isEmpty());
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception
    {
      s.push("testString");
      assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
      String s1 = "test1";
    	String s2 = "test2";
    	s.push(s1);
    	assertFalse(s.isEmpty());
    	s.push(s2);
    	assertEquals(s2,s.pop());
    	assertFalse(s.isEmpty());
    	assertEquals(s1,s.pop());
    	assertTrue(s.isEmpty());
    }
    
    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */
    
    /**
     * Testing for IllegalStateException, which should be thrown at illegal push or pop operations
     * @throws Exception
     */
    @Test(expected=IllegalStateException.class)
    public void testPushException() throws Exception {
    	while (true) {
    		s.push("test");
    	}
    }

}
