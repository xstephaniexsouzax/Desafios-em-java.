package triangulos;

import java.util.Scanner;

public class Triangulos {
    static void main() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de a, b e c para saber qual a clasificação do triângulo");
        System.out.print("Digite o valor de a: ");
        int a = ler.nextInt();
        System.out.print("Digite o valor de b: ");
        int b= ler.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = ler.nextInt();
        if ((a<b+c) && (b<c+a) && (c<b+a)){
            System.out.println("Os valores de a,b e c formam um triangulo");
            if ((a==b) && (a==c) ){
                System.out.println("O triângulo é equilátero. a,c e c são iguais");
            } else if ((a==b) || (b==c) || (c==a)) {
                System.out.println("O triângulo é isoceles. a é igual a b é igual a c ou c é igual a ");
            } else {
                System.out.println(" O triangulo é escaleno. a,b,c são diferentes");
            }
            System.out.println("A,b e c não formam um triângulo");
        }
    }
}
