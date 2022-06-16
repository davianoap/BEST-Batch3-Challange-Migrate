package Challange2;
import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l1=1;
        do
        {
            System.out.println("Masukkan Lantai Tujuan");
            int l2=sc.nextInt();
            int i = 1;
            if (l2 == -1) {
                System.exit(0);
            }
            if(l2>l1) {
                for( i=l1;i<l2;i++){
                    System.out.println("Elevator di lantai "+i) ;
                }
            } else {
                for( i=l1;i>l2;i--){
                    System.out.println("Elevator di lantai "+i);
                }
            }
            System.out.println("Elevator berhenti di lantai "+i);
            l1=l2;
        }while(true);
    }
}