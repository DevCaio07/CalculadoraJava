import java.util.Scanner;

public class Main {

    public Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num1, Num2, op;

        System.out.print("Digite o primeiro numero: ");
        Num1 = scanner.nextInt();

        System.out.print("Digite o segundo Valor: ");
        Num2 = scanner.nextInt();

        System.out.print("=======Escolha a operação=======");
        System.out.print("1- Soma");
        System.out.print("2- Subtração");
        System.out.print("3- Multiplicacão");
        System.out.print("4- Divisão");
        op = scanner.nextInt();

        switch (op) {

            case 1:
                System.out.print(Num1 + Num2);
                break;

            case 2:
                System.out.print(Num1 - Num2);
                break;

            case 3:
                System.out.print(Num1 * Num2);
                break;

            case 4:
                System.out.print(Num1 / Num2);
                break;
        }


    }

}