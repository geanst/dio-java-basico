package exercicioPetStore;

public class Pet {
    private boolean isClean;
    final private String petName;

    public Pet(String petName) {
        this.isClean = false;
        this.petName = petName;
    }
    public String getName() {
        return this.petName;
    }
    public boolean isClean() {
        return this.isClean;
    }
    public void setIsClean(boolean clean) {
        this.isClean = clean;
    }
}
