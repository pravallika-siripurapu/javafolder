class Person {
    private String name;

    // Getter method to access the private field
    public String getName() {
        return name;
    }

    // Setter method to modify the private field
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Using setter to set the name
        person.setName("Chandra");

        // Using getter to access the name
        System.out.println("Name: " + person.getName());
    }
}