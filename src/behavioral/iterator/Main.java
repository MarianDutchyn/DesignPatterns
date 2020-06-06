package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"Java 11", "Spring", "Hibernate", "SQL", "Maven"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Andy", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills:");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
    }
}
