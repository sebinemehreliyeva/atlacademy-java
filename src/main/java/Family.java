import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.pet = null; // No pet initially
        // Link children to this family
        mother.setFamily(this);
        father.setFamily(this);
    }

    // Getters and setters
    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    // Method to add a child to the family
    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    // Method to delete a child from the family
    public boolean deleteChild(Human child) {
        boolean removed = children.remove(child);
        if (removed) {
            child.setFamily(null); // unlink child from this family
        }
        return removed;
    }

    // Method to count family members
    public int countFamily() {
        // Count includes mother, father, and all children
        return 2 + children.size(); // 2 for mother and father
    }

    // toString method to display family details
    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }

    // equals and hashCode methods based on mother, father, children, pet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pet);
    }
}
