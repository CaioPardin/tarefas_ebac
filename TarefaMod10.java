package br.com.cpardin;

import java.util.*;

public class TarefaMod10 {


        public static void main(String args[]) {

                System.out.println("Você precisa de no minimo 7 para ser aprovado!");

                Scanner s = new Scanner(System.in);

                System.out.println("digite sua média do primeiro semestre");
                int media1 = s.nextInt();

                System.out.println("digite sua média do segundo semestre");
                int media2 = s.nextInt();

                System.out.println("digite sua média do terceiro semestre");
                int media3 = s.nextInt();

                System.out.println("digite sua média do quarto semestre");
                int media4 = s.nextInt();

                float media5 = ((media1+media2+media3+media4)/4f);

                System.out.println("Sua media final é : " + media5);



                if (media5 >=7) {
                        System.out.println("sua nota é" +  "Parabens voce foi aprovado!");
                } else if ((media1+media2+media3+media4)/4 >=5) {
                        System.out.println("Voce ficou de recuperacao!");
                } else {
                        System.out.println("Voce foi reprovado!");
                }


        }




}
