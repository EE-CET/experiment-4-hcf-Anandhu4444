import java.util.Scanner;
public class HCF {
        public static int greatest(int a,int b){
	while(b!=0){
	        int temp=b;
		b=a%b;
		a=temp;
	}
	return a;

}

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("HCF is "+greatest(a,b));
    }
}


