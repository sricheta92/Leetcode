import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.easy.arrays.MergeSortedArrays;

public class TestMergeSortedArrays {

	MergeSortedArrays arrays = null;
	int[] arr1 = null;
	int[] arr2 = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		arr1 = new int[]{1,3,5,7};
		arr2 =  new int[]{2,4,6,8};
		arrays = new MergeSortedArrays();
	}

	@After
	public void tearDown() throws Exception {
		arrays = null;
	}

	@Test
	public void testMergeArrays() {
		int[]arr = arrays.mergeArrays(arr1, arr2);
		assertEquals(arr1.length+ arr2.length, arr.length);
	}

}
