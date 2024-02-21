import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        int i=0;
        System.out.println("Enter positive number");
        do{
            System.out.print("Input number: ");
            num[i] = s.nextInt();
            i++;
            int[] a = new int[num.length * 2];
            System.arraycopy(num, 0, a, 0, num.length);
            num = a;
        }while(num[i-1]>0);
        System.out.println("Output number");
        for(int k=0;k<i-1;k++){
            System.out.println("The number is: "+num[k]);
        }
    }
}