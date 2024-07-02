public class MyClass {
    public static void main(String[] args) {
                // Create some humans
                Human mother = new Human("Alice", "Smith", 30, 120, new String[][]{{"Monday", "Cooking"}, {"Tuesday", "Cleaning"}});
                Human father = new Human("Bob", "Smith", 32, 125, new String[][]{{"Monday", "Working"}, {"Tuesday", "Gardening"}});
                Human child1 = new Human("Charlie", "Smith", 5, 110, new String[][]{{"Monday", "Playing"}, {"Tuesday", "Studying"}});
                Human child2 = new Human("Daisy", "Smith", 3, 115, new String[][]{{"Monday", "Drawing"}, {"Tuesday", "Reading"}});

                // Create a pet
                Pet pet = new Pet("Max", 3, "Dog");

                // Create a family
                Family family = new Family(mother, father);
                family.addChild(child1);
                family.addChild(child2);
                family.setPet(pet);

                // Display family details
                System.out.println("Family Details:");
                System.out.println(family);

                // Test deleteChild method
                System.out.println("\nDeleting child Daisy from the family...");
                boolean removed = family.deleteChild(child2);
                if (removed) {
                    System.out.println("Daisy successfully removed from the family.");
                } else {
                    System.out.println("Failed to remove Daisy from the family.");
                }

                // Display updated family details
                System.out.println("\nUpdated Family Details:");
                System.out.println(family);
            }
        }
