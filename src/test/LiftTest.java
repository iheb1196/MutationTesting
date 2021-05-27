package test;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.Lift;

public class LiftTest {
	Lift lift;
	@Before
	public void setUp() {
	 lift = new Lift(20,20);
	}

    
	@Test
	public void ConstructorTesting() {
		assertNotNull(lift);
		assertEquals(20,lift.getTopFloor());
		assertEquals(0,lift.getNumRiders());
		assertEquals(0,lift.getCurrentFloor());
		assertEquals(20,lift.getCapacity());
	}

     @Test
    public void AddDriverTestTrue() {
    	lift.addRiders(4);
    	assertEquals(4,lift.getNumRiders());
    	assertFalse(lift.isFull());
    	
    }
     @Test
     public void AddDriverTestTrue2() {
     	lift.addRiders(21);
     	lift.addRiders(5);
     	assertEquals(20,lift.getNumRiders());
     	assertTrue(lift.isFull());
     	
     }
     @Test
     public void AddDriverTestFalse3() {
     	lift.addRiders(2);
     	lift.addRiders(5);
     	assertEquals(7,lift.getNumRiders());
     	assertFalse(lift.isFull());
     }

    @Test
    public void AddDriverTestFalse() {
    	lift.addRiders(21);
    	assertEquals(20,lift.getNumRiders());
    	assertTrue(lift.isFull());
    }
   
    //Killed 59 boundary change mutation	
    @Test
    public void call() {
    	lift.call(1);
    	lift.call(0);
    	assertEquals(0,lift.getCurrentFloor());
    }
    
  
  
   
 
   
   @Test
   public void test() {
	   lift.call(21);
	   assertEquals(0,lift.getCurrentFloor());
	   
   }
   
  
   @Test
   public void goUpTestFalse() {
	   lift.goUp();
	   assertEquals(1,lift.getCurrentFloor());
   }
   //Killed two mutation but adding this condition
   @Test
   public void goUpMu() {
	   lift.call(20);
	   lift.goUp();
	   assertEquals(20,lift.getCurrentFloor());
   }
   
   @Test
   public void callTest() {
	   lift.call(2);
	   assertEquals(2,lift.getCurrentFloor());
   }
   /*
   @Test
   public void test7() {
	   lift.addRiders(19);
	   lift.addRiders(7);
	   assertEquals(20,lift.getNumRiders());
	   assertTrue(lift.isFull());
   }
   */
   @Test 
   public void callTestFalse() {
	   lift.call(2);
	   lift.call(1);
	   assertEquals(1,lift.getCurrentFloor());
   }
   @Test
   public void callTest11() {
	   lift.call(-1);
	   assertEquals(0,lift.getCurrentFloor());
   }
   
   @Test
   public void goDownTest1() {
	   lift.goDown();
	   assertEquals(0,lift.getCurrentFloor());
   }
   
   
   

}

   
  
