import com.tests.Array;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

import java.util.Arrays;

public class ArrayTest {
	Array array;

	@Before
	public int[] init() {
		array = new Array();
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
			Assertions.assertTrue(4, Array.getArrayAfterFour(arr));

	}

	public static void main(String[] args) {
		ArrayTest arrayTest = new ArrayTest();
		arrayTest.getArrayAfterFourTest(arrayTest.init());
	}
}


