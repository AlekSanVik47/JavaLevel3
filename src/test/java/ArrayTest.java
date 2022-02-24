import com.tests.ArrayAfterFour;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayTest {
	ArrayAfterFour array;

	@Before
	public int[] init() {
		array = new ArrayAfterFour();
		int sizeArr = (int) (Math.random() * 10);
		int[] arr = new int[sizeArr];
		for (int i = 0; i < sizeArr; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}


	@Test
	public void getArrayAfterFourTest(int[] arr) {
		arr = new int[]{1, 5, 6, 0, 4, 11, 2, 3, 7};
		for (int e:
		     arr) {
			Assertions.assertTrue(e == 4, String.valueOf(ArrayAfterFour.getArrayAfterFour(arr)));
		}

	}

	public static void main(String[] args) {
		ArrayTest arrayTest = new ArrayTest();
		arrayTest.getArrayAfterFourTest(arrayTest.init());
	}
}


