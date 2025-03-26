package com.exemplo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        PetMachine petMachine = new PetMachine();
        while (isRunning) {
            int userChoice = getUserChoice(scanner);
            isRunning = handleUserChoice(scanner, petMachine, userChoice);
        }
        scanner.close();
    }

    private static boolean handleUserChoice(Scanner scanner, PetMachine petMachine, int userChoice) {
        switch (userChoice) {
            case 1 -> petMachine.cleanPet();
            case 2, 3 -> petMachine.refillWaterAndShampoo();          
            case 4 -> System.out.println("O nível de água é " + petMachine.getWater());
            case 5 -> System.out.println("O nível do Shampoo é " + petMachine.getShampoo());
            case 6 -> System.out.println(petMachine.hasPet() ? "Há um pet na máquina.": "Não há um pet na máquina.");
            case 7 -> addPet(scanner, petMachine);
            case 8 -> petMachine.takePetFromMachine();
            case 9 -> petMachine.cleanMachine();
            case 10 -> {
                System.out.println("Bye bye.");
                return false;
            }
            default -> System.out.println("Opção inválida.");
        }
        return true;
    }

    private static void addPet(Scanner scanner, PetMachine petMachine) {
        System.out.println("Qual vai ser o pet a entrar na máquina?");
        Pet newPet = new Pet(scanner.next());
        petMachine.putPetInsideMachine(newPet);
    }

    private static int getUserChoice(Scanner scanner) {
        String introText = """
            \nO que você quer fazer?
            1-Dar banho no pet;
            2-Abastecer com água;
            3-Abastecer com shampoo;
            4-Verificar nivel de água;
            5-Verificar nivel de shampoo;
            6-Verificar se tem pet no banho;
            7-Colocar pet na maquina;
            8-Retirar pet da máquina;
            9-Limpar maquina;
            10-Sair.
            """;        
        System.out.println(introText);
        int userChoice = -1;
        while (userChoice < 1 || userChoice > 10) {
            System.out.println("Escolha uma opção (1-10)");
            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
            } else {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
                continue;
            }
            
        }
        return userChoice;
    }
}
