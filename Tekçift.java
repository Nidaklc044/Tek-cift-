
package tekçift;
import java.util.Scanner;
public class Tekçift {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("bir sayı giriniz");
int sayi=scan.nextInt();
if(sayi%2==0){
    System.out.println("çift");
}
else
    System.out.println("tektir");
    }
    
}
