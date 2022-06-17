package Challange3;

public class Ganjilgenap {
    public static void main(String[] args) {
        for (int i = 1 ; i <=7; i+=2) {
            if(i==1)
                System.out.println("ganjil");
            if(i==2)
                System.out.println("genap");
            System.out.println(i);
            if(i==5)
            i=0;
        }
    }
}
