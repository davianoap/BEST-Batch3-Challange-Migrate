package Challange2;
import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int floor=1;
        do
        {
            System.out.println("Masukkan Lantai Tujuan");
            int inputFloor=sc.nextInt();
            int i = 1;
            if (inputFloor == -1 || inputFloor > 30) {
                System.exit(0);
            }
            if(inputFloor>floor) {
                for( i=floor;i<inputFloor;i++){
                    System.out.println("Elevator di lantai "+i) ;
                }
            } else {
                for( i=floor;i>inputFloor;i--){
                    System.out.println("Elevator di lantai "+i);
                }
            }
            System.out.println("Elevator berhenti di lantai "+i);
            floor=inputFloor;
        }while(true);
    }
}