package com.company;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int san1 = scanner.nextInt();
        int san2 = scanner.nextInt();
        int sum = 0;
        for (int i = san1; i > 0 && i < san2; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " ");
            }sum = sum+i ;
        }
         System.out.println(sum);

/*       Scanner scanner1 = new Scanner(System.in);
        int birsan = scanner1.nextInt();
        int sum = 0;
        for (int i = 1; birsan >= i; i++) {
            sum += i;
            System.out.print(i);
            if(birsan != i) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);
*/
//        Scanner scanner = new Scanner(System.in);
//        int san = scanner.nextInt();
//        int koboitundu =0;
//         for (int i = 1 ;san > i && san <10;i*=i){
//            System.out.println(i + "*");
//         }
//
     /* Scanner scanner =new Scanner(System.in);
      int bir = scanner.nextInt();
        int eki = scanner.nextInt();
      if (bir>999999 && bir<9999999 ){
          System.out.println();
      }else if (eki>0 && eki<9){

      }else {

      }*/

      /* for(int i = 1 ; i<11 ; i++) {
           System.out.print(i + " ");
       } int i= 0;
        while(i <10){
         i++;
            System.out.print(i+ " ");
        }*/
//     Scanner scanner =new Scanner(System.in);
//     int birSan = scanner.nextInt();
//     int summa = 1;
//     for (;birSan>0 &&  birSan<10; birSan-- ){
//         summa = summa* birSan;
//     }
//        System.out.println(summa);
//
//          Scanner scanner = new Scanner(System.in);
//        System.out.println("Bir butun san beriniz");
//                int sandar = scanner.nextInt();
//                int summa = 0;
//                for (int i = 1; i <= sandar ; i++) {
//                    if (i%2 == 1){
//                        summa += i;
//                        System.out.print(i);
//                        if (i != sandar-1) {
//                            System.out.print(" + ");
//                        } else {
//                            System.out.print(" = ");
//                        }
//                    }
//
//                }
//                System.out.println(summa);



        
    }
}
