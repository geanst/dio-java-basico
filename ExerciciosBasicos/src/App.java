import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o exercício quer fazer? (Digite o número de 1 a 5)");
        Integer exNum = scanner.nextInt();
        exercises(exNum);
        scanner.close();
    }

    public static void exercises(Integer exNum){
        Scanner scanner = new Scanner(System.in);
        if (exNum == 1) {
            //Exercício 1
            System.out.println("Digite seu nome e idade!");
            String name = scanner.next();
            Integer age = scanner.nextInt();        
            System.out.println("Olá " + name + "! Você tem " + age + " anos.");
        } else if (exNum == 2) {
            //Exercício 2
            System.out.println("Digite um número para gerar a tabuada dele:");
            Integer numInteger = scanner.nextInt();
            for (Integer i = 1; i <= 10; i++) {
                System.out.println(numInteger + " x " + i + " = " + (numInteger * i));
            }
        } else if (exNum == 3) {
            //Exercício 3
            System.out.println("Calcule o IMC. Digite sua altura em metros e o peso em quilos.");
            Double height = scanner.nextDouble();
            Integer weight = scanner.nextInt();
            Double imc = (double) weight / (height * height);
            System.out.print("Seu IMC é de " + imc + ". ");
            if(imc <= 18.5){
                System.out.println("Abaixo do peso");
            }else if(imc <= 24.9){
                System.out.println("Peso ideal");
            }else if(imc <= 29.9){
                System.out.println("Levemente acima do peso");
            }else if(imc <= 34.9){
                System.out.println("Obesidade Grau I");
            }else if(imc <= 39.9){
                System.out.println("Obesidade Grau II (Severa)");
            }else{
                System.out.println("Obesidade III (Mórbida)");
            }
        } else if (exNum == 4) {
            //Exercício 4
            System.out.println("Digite dois números em ordem crescente:");
            Integer num1 = scanner.nextInt();
            Integer num2 = scanner.nextInt();
            System.out.println("Os números entre " + num2 + " e " + num1 + "divisíveis por 2 são:");
            for(Integer i = num2; i >= num1; i--){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        } else if (exNum == 5) {
            
        }
        scanner.close();
    }
}
