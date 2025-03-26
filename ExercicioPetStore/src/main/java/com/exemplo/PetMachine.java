package com.exemplo;

public class PetMachine {
    private boolean isClean;
    private int water;
    private int shampoo;
    private boolean hasPet;
    private Pet currentPet;


    public PetMachine() {
        this.hasPet = false;
        this.isClean = false;
        this.shampoo = 0;
        this.water = 0;
        this.currentPet = null;
    }
    
    public int getWater() {
        return this.water;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean hasPet() {
        return this.hasPet;
    }

    public boolean isClean() {
        return this.isClean;
    }

    public void refillWaterAndShampoo() {
        this.water = 30;
        this.shampoo = 10;
        System.out.println("Shampoo e água foram repostos!");
    }

    public void cleanMachine() {
        if (this.hasPet) {
            System.out.println("Há um pet dentro da máquina.");
        } else if (this.shampoo < 1 || this.water < 2) {
            System.out.println("Não há água ou shampoo suficientes.");
        } else {
            this.shampoo -= 1;
            this.water -= 2;
            this.isClean = true;
            System.out.println("A máquina foi limpa!");
            System.out.println("Nível da água: " + this.water + " nível do shampoo: " + this.shampoo);
        }
    }

    public void putPetInsideMachine(Pet newPet) {
        if (!this.hasPet) {
            this.currentPet = newPet;
            this.hasPet = true;
            System.out.println(newPet.getName() + " está dentro da máquina!");
        } else {
            System.out.println("Máquina já tem um pet. " + newPet.getName() + " será eliminado!");
        }
    }

    public void takePetFromMachine() {
        if (this.hasPet) {
            System.out.println(this.currentPet.getName() + " foi retirado da máquina!");            
            this.currentPet = null;
            this.hasPet = false;
        } else {
            System.out.println("Não há pet dentro da máquina.");
        }
    }

    public void cleanPet() {
        if (!this.hasPet) {
            System.out.println("Não há pet dentro da máquina.");
        } else if (this.shampoo < 2 || this.water < 10) {
            System.out.println("Não há água ou shampoo suficientes.");
        } else if (!this.isClean) {
            System.out.println("A máquina está suja.");
        } 
        else {
            this.shampoo -= 2;
            this.water -= 10;
            this.isClean = false;
            this.currentPet.setIsClean(true);
            System.out.println(this.currentPet.getName() + " foi limpo!");
            System.out.println("Nível da água: " + this.water + " nível do shampoo: " + this.shampoo);            
        }
    }
}
