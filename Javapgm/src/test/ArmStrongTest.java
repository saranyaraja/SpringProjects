package test;


import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Armstrong;

public class ArmStrongTest {
	Armstrong arm = new Armstrong();
	
	public ArmStrongTest() {
		System.out.println("TESTING armstrong MAIN");
		
	}
    @Test
    public void testArmwith370(){
    	boolean result = arm.checkArmstrong(370);
    	assertEquals(result,true);
    	System.out.println("370 is armstrong!!!");
    }
    @Test
    public void testArmFails(){
    	boolean result = arm.checkArmstrong(250);
    	assertEquals(result,false);
    	System.out.println("250 is not armstrong!!!");
    }
}
