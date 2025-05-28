import java.util.Arrays;
public class ArraySortingAlphabetFunction{
	public static void sortAlphabets(String[] args){
	
	String words = " ";

	for(int count = 0; count < words.length - 1; count++){
		for(int counter = 0; counter < words.length - count -1; counter++){


			if (words[counter].compareTo(words[counter + 1]) > 0){

				String temp = Arrays[counter];
				Arrays[counter] = Arrays[counter + 1];
				Arrays[counter + 1] = temp;


}
}
}
}


	public static void main(String[] args){

		String[] words = {"a", "b", "c", "d", "e", "f", "g"};

		Arrays.sort(words);

		System.out.println("Sorted words: ");

		for(String word : words) {

		System.out.print(word + " ");

}


}

}







