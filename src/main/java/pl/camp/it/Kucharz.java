package pl.camp.it;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kucharz {

    public static void main(String[] args) {
        int j;
        int p;
        int z;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Podaj ilosc jablek: ");
            j = scanner.nextInt();
            System.out.println("Podaj ilosc pomaranczy: ");
            p = scanner.nextInt();
            System.out.println("Podaj ilosc monet: ");
            z = scanner.nextInt();
            System.out.println(Oblicz(j,p,z));
            scanner.close();
        } catch (InputMismatchException e){
            System.out.println("wpisano niepoprawne dane");
        }

    }

    public static int Oblicz(int j, int p, int z){
        for(int i = 0; i < z; i++){
            if(j <= p){
                j++;
            }else{
                p++;
            }
        }
        return Math.abs(j-p);
    }


}
