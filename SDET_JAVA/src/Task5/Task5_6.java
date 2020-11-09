package Task5;

public class Task5_6 {
public boolean isBinaryNumber(int binary){
		
		boolean status = true;
		while(true){
			if(binary == 0){
				break;
			} else {
				int tmp = binary%10;
				if(tmp > 1){
					status = false;
					break;
				}
				binary = binary/10;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		Task5_6 mbc = new Task5_6();
	        System.out.println("Is 1000111 binary? :"+mbc.isBinaryNumber(10010011));
	        System.out.println("Is 10300111 binary? :"+mbc.isBinaryNumber(10300111));

	}

}
