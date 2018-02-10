import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.easy.queue.QueueDemo;

public class TestQueueDemo {

	  Queue<Integer> queue  = null;
	  QueueDemo queueDemo = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 queue  = new LinkedList<Integer>();
		 queueDemo = new QueueDemo(queue);
	}

	@After
	public void tearDown() throws Exception {
		queue  = null;
		queueDemo = null;
	}

	@Test
	public void testMakeQueue() {
		Queue<Integer> retQueue = queueDemo.makeQueue();
		System.out.println(retQueue.size());
		assertEquals(retQueue.size(),queue.size());
	}
	
	@Test
	public void testSeeFront() {
		testMakeQueue();
		int elemAtFront = queueDemo.seeFront();
		assertEquals(elemAtFront,queue.peek().intValue());
	}
	
	@Test
	public void testdeQueue() {
		testMakeQueue();
		int elemADeQueued = queueDemo.deQueue();
		assertEquals(false,queue.contains(elemADeQueued));
	}
	
	

}
