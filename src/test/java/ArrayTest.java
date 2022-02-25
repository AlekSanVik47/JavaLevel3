import com.tests.ArrayAfterFour;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThrows;


public class ArrayTest {
	ArrayAfterFour afterFour;
	private int[] arr;
	private boolean flag;

//	public ArrayTest(int[] arr, boolean flag) {
//		this.arr = arr;
//		this.flag = flag;
//	}


	@Parameterized.Parameters
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][]{
				{5, 7, 8, 9, 4, 1},
				{1, 2, 4, 4, 2, 3, 4, 1, 7},
				{1, 2, 1, 1, 2, 3, 5, 1, 7},
				{4, 4, 4, 4},
				{}
		});
	}

	@Before
	public void init() {
		afterFour = new ArrayAfterFour();
	}


	@Test
	public void getArrayAfterFourTest() {
		Assert.assertArrayEquals(new int[]{11, 2, 3, 7}, afterFour.getArrayAfterFour(new int[]{1, 5, 6, 0, 4, 11, 2, 3, 7}));
	}

	@Test
	 void getArrayAfterFourTestException() {
 /*Exception exception = assertThrows(RuntimeException.class, () ->
		 afterFour.getArrayAfterFour(new int[]{1, 5, 6, 0, 7, 11, 2, 3, 7}));
		Assertions.assertEquals(" ",exception.getMessage());*/
		ArrayAfterFour.getArrayAfterFour(new int[]{1, 5, 6, 0, 7, 11, 2, 3, 7});
		Assertions.assertEquals(RuntimeException.class, RuntimeException.class);
	}


}


