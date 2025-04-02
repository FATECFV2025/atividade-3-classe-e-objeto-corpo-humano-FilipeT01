// package main.java;
// import java.util.Scanner;
 
// public class App {
//         //Comentário
 
//     public static void funcao_teste (){
//         //Biblioteca para entrada de dados
//         Scanner ler = new Scanner(System.in);
 
//         //variável local a
//         String v2;
//         int v1;
 
//         System.out.println("Comando de Saida de Dados");
       
//         System.out.printf("Informe uma palavra: ");
//         v2 = ler.next();
 
//         System.out.printf("Informe um número: ");
//         v1 = ler.nextInt();
 
//         System.out.printf(v2+" "+v1);
//     }
//     public static void main(String[] args) throws Exception {
//         funcao_teste();
 
 
//     }
// }
 
 
package main.java;
import java.util.Scanner;
 
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
       
        CorpoHumano c1 = new CorpoHumano(70, 0.07f, 1000, 1.75f);
 
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " kg/m³");
        System.out.println("Altura: " + c1.getAltura() + " m");
 
       
        System.out.println("IMC: " + c1.calcularIMC());
 
   
        System.out.print("\nDigite uma nova massa (kg): ");
        float novaMassa = scanner.nextFloat();
        c1.setMassa(novaMassa);
 
        System.out.print("Digite uma nova altura (m): ");
        float novaAltura = scanner.nextFloat();
        c1.setAltura(novaAltura);
 
        System.out.println("\nNovos valores:");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("Novo IMC: " + c1.calcularIMC());
 
        scanner.close();
    }
}