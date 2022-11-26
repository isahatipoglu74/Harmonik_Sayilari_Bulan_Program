import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Bir sayi giriniz:");
        double sayi= inp.nextInt();
        double result=0.0;

        for(double i=1.0;i<=sayi;i++){
            result+=(1/i);
        }
        System.out.println(result);
    }
}