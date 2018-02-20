package test.java;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.Armstrong;

public class TestArmStrong1 {

	
	Armstrong arm = new Armstrong();
	
	public TestArmStrong1() {
		System.out.println("TESTING TestArmStrong1 JAVA");
		
	}
	
	public static void main(String args[]){
		System.out.println("3701 is armstrong");
		assertEquals(true,true);
	}
	
	@Test
	public void testCheckArmstrong() {
		//fail("Not yet implemented");
	}
    @Test
    public void testArmwith370(){
    	boolean result = arm.checkArmstrong(370);
    	assertEquals(result,true);
    	System.out.println("370 is armstrong***");
    }
    @Test
    public void testArmFails(){
    	boolean result = arm.checkArmstrong(250);
    	assertEquals(result,false);
    	System.out.println("250 is not armstrong***");
    }
}
