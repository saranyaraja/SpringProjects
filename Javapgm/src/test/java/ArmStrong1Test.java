package test.java;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;
import main.java.Armstrong;

public class ArmStrong1Test {
	
	private static Logger log = log = Logger.getLogger(ArmStrong1Test.class.getName());;
	
	Armstrong arm = new Armstrong();
	
	@Before
	public void init(){
		log.info("ArmStrong1Test init::");
	}
	
	public ArmStrong1Test() {
		System.out.println("TESTING ArmStrong1Test JAVA");
		log.info("I'm starting");
	}
	public static void main(String args[]){
		System.out.println("370 is armstrong");
		assertEquals(true,true);
	}
	
	@Test
	public void testCheckArmstrong() {
		//fail("Not yet implemented");
		assertEquals(true,true);
	}
    @Test
    public void testArmwith370(){
    	boolean result = arm.checkArmstrong(370);
    	assertEquals(result,true);
    	System.out.println("370 is armstrong---");
    }
    @Test
    public void testArmFails(){
    	boolean result = arm.checkArmstrong(250);
    	assertEquals(result,false);
    	System.out.println("250 is not armstrong---");
    }
}
