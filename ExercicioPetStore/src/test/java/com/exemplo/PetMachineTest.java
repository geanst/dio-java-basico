package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PetMachineTest {

    private PetMachine petMachine; 

    @BeforeEach
    public void setUp() {
        petMachine = new PetMachine();
    }

    @Test
    public void initialState() {
        assertFalse(petMachine.hasPet(), "A máquina não deve ter pets!");
        assertFalse(petMachine.isClean(), "A máquina deve iniciar suja!");
        assertEquals(0, petMachine.getWater(),"O nível de água deve ser zero!");
        assertEquals(0, petMachine.getShampoo(),"O nível de shampoo deve ser zero!");
    }

    @Test
    public void refillWaterAndShampooTest() {
        petMachine.refillWaterAndShampoo();
        assertEquals(30, petMachine.getWater(), "O nível de água deve ser 30");
        assertEquals(10, petMachine.getShampoo(), "O nível de shampoo deve ser 10");
    }

    @Test
    public void cleanMachineTest() {
        petMachine.cleanMachine();
        assertFalse(petMachine.isClean(), "A máquina precisa de água e shampoo para ser limpa!");
        Pet newPet = new Pet("Cão");
        petMachine.putPetInsideMachine(newPet);
        petMachine.cleanMachine();
        assertFalse(petMachine.isClean(), "A máquina não pode ser limpa com um pet dentro!");
        petMachine.takePetFromMachine();
        petMachine.refillWaterAndShampoo();
        petMachine.cleanMachine();
        assertTrue(petMachine.isClean(), "A máquina não foi limpa ou houve problema na reposição de água.");
    }

    @Test
    public void putPetInsideMachineTest() {
        Pet newPet = new Pet("Cão");
        petMachine.putPetInsideMachine(newPet);
        assertTrue(petMachine.hasPet(), "O pet deveria estar dentro da máquina!");
    }

    @Test
    public void takePetFromMachine() {
        Pet newPet = new Pet("Cão");
        petMachine.putPetInsideMachine(newPet);
        petMachine.takePetFromMachine();
        assertFalse(petMachine.hasPet(), "O pet deveria de ter sido retirado da máquina!");
    }

    @Test
    public void cleanPet() {
        Pet newPet = new Pet("Cão");
        petMachine.cleanPet();
        assertFalse(newPet.isClean(), "O pet deveria estar sujo ainda!");
        petMachine.refillWaterAndShampoo();
        petMachine.cleanMachine();
        petMachine.putPetInsideMachine(newPet);
        petMachine.cleanPet();
        assertTrue(newPet.isClean(), "O pet deveria estar limpo!");
    }

    @Test
    public void checkWaterAndShampooLevels() {
        petMachine.refillWaterAndShampoo();
        petMachine.cleanMachine();
        assertEquals(9, petMachine.getShampoo(), "O nível do shampoo está diferente do esperado!");
        for(int i = 0; i <= 10; i++ ) {
            petMachine.cleanMachine();
        }
        assertEquals(0, petMachine.getShampoo(), "O nível do shampoo está diferente do esperado!");
    }
}