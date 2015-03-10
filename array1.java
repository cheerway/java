import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6]; 
		while (sc.hasNext()) {
			try{
				for(int i = 0; i < 6; i++){
//System.out.print("Input a integer number: ");
					a[i] = sc.nextInt();
				}
				for(int i = 5; i >= 0; i--){
					System.out.print(a[i]);
					if(i>0)
						System.out.print(" ");
				}

			}
			finally
			{
				System.out.println("");
			}
		}
	}
}