package Task5;

public class Task5_2 {

	public static void main(String[] args) {
		int temp, size;
	      int array[] = {10, 20, 25, 102, 110, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second largest number is:: "+array[size-2]);
	}

}
