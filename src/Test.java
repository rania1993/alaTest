 
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){
	
		System.out.println("Enter your number:");
		//open reader
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		//close reader
		scan.close();
		
		
		if(number.startsWith("+46732")){
			System.out.println("It is not possible to dial +46732 with the operator B but with the operator A you will have to pay $1.1/min  ");
		}else if(number.startsWith("+4673")){
			System.out.println("It is not possible to dial +4673 with the operator B but with the operator A you will have to pay $0.9/min ");
			
		}else if(number.startsWith("+4631")){
			System.out.println("It is not possible to dial +4631 with the operator B  But with the operator A you will have to pay $0.15/min ");

		}else if(number.startsWith("+4620")){
			System.out.println("It is not possible to dial +4620 with the operator B But with the operator A you will have to pay $0.0/min ");

		}else if(number.startsWith("+467")){
			System.out.println("It is not possible to dial +4620 with the operator A But with the operator B you will have to pay $1.0/min  ");

		}else if(number.startsWith("+468")){
			System.out.println("It is not possible to dial +468 with the operator B But with the operator A you will have to pay $0.15/min ");

			
		}else if(number.startsWith("+268")){
			System.out.println("It is not possible to dial +268 with the operator B But with the operator A you will have to pay $5.1/min");

		}else if(number.startsWith("+46")){
			System.out.println("you will have to pay $0.17/min with the operator A and $0.2/min with the operator B");

		}else if(number.startsWith("+48")){
			System.out.println("It is not possible to dial +48 with the operator A But with the operator B you will have to pay $1.2/min ");

		}else if(number.startsWith("+44")){
			System.out.println("It is not possible to dial +44 with the operator A But with the operator B you will have to pay $0.5/min ");

		}else if(number.startsWith("+1")){
			System.out.println("you will have to pay $0.9/min with the operator A and $0.92/min with the operator B");

			
		}
		
	}

}
