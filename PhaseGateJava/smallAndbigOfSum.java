
public class ArraySorting{
	public static void smallAndbigOfSum(int[] list) {

	for(int number = 0; number < list.length - 1; number++) {
		int MinNumber = list[number];
		int MinNumberIndex = number;


	for (int counter = number + 1; counter < list.length; counter++){
		if (MinNumber > list[counter]) {
		MinNumber = list[counter];
		MinNumberIndex = counter;

	}

	}


	if (MinNumberIndex != number){

	list[MinNumberIndex] = list[number];
	list[number] = MinNumber;



}

}


}
}