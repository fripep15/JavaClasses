package replall;

public class QUIZEmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 4, 3, 6,44,8, 2, 5 };

		int array1 = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > array1) {

		                  array1 = array[index];

		        }

		}

		System.out.println(array1);

		}
	}