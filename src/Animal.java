public class Animal {


    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.println("Default roaar!");
    }
}
