import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.easy.queue.QueueDemo;
import com.easy.queue.StackDemo;

public class TestStackDemo {

	  Stack<Integer> stack  = null;
	  StackDemo stackDemo = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		stack  = new Stack<Integer>();
		stackDemo = new StackDemo(stack);
	}

	@After
	public void tearDown() throws Exception {
		stack  = null;
		stackDemo = null;
	}

	@Test
	public void testPrepareStack() {
		Stack<Integer> retStack = stackDemo.prepareStack();
		System.out.println(retStack.size());
		assertEquals(retStack.size(),stack.size());
	}
	
	@Test
	public void testTop() {
		testPrepareStack();
		int elemAtTop = stackDemo.top();
		assertEquals(elemAtTop,stack.peek().intValue());
	}
	
	@Test
	public void testPop() {
		testPrepareStack();
		int elemPopped = stackDemo.pop();
		assertEquals(false,stack.contains(elemPopped));
	}
	

}
