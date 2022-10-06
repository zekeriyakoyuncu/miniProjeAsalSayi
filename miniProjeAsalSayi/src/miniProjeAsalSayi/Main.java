package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 3;
		boolean flag = true;
		
		if(number < 1) {
			System.out.println("Geçersiz sayı.");
		}
		else if(number == 1) {
			System.out.println("Asal değildir.");
		}
		else {
			if(number==2) {
				System.out.println("Asal sayıdır.");
			}
			else {
			for(int index=2 ; index<number ; index++) {
				if(number%index == 0) {
					flag = false;
				}
			}
			
			if(flag) {
				System.out.println("Asal sayıdır.");
			}
			else {
				System.out.println("Asal değildir.");
			}
		}
		}
		

	}

}
