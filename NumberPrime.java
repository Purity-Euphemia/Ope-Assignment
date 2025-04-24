public class NumberPrime{
	public static void main(String[] args) {
	

	for(int index = 2; index <= 10; index++) {
		int count = 0;
		for(int counter=2; counter<=index; counter++){
			if(index % counter == 0){
				count++;
			}
		}
		if(count == 1){
			System.out.println(index);
		}

	




}




}



}