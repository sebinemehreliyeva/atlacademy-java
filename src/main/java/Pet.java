import java.util.Objects;

public class Pet {
    private String name;
    private int age;
    private String species;

    public
    Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // toString, equals, and hashCode methods
    @Override
    public String toString() {
        return "Pet{name='" + name + "', age=" + age + ", species='" + species + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                Objects.equals(name, pet.name) &&
                Objects.equals(species, pet.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, species);
    }
}
