package Person;

public class Main {
    public static void main(String[] args) {
        Person newPerson1 = new Person.Builder()
                .withFirstName("Ivan")
                .withLastName("Petrov")
                .withCountry("Russia")
                .build();
        Person newPerson2 = new Person.Builder()
                .withFirstName("John")
                .withLastName("Snaider")
                .withCountry("England")
                .withAge(45)
                .withPhone("34-23-56")
                .build();

        System.out.println("newPerson1 " + newPerson1);
        System.out.println("newPerson2 " + newPerson2);
    }
}
