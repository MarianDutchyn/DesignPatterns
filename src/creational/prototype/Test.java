package creational.prototype;

public class Test {
    public static void main(String[] args) {
        Project project = new Project(1, "Web Site", 1000);
        System.out.println(project);
        System.out.println("==========");
        Project clone = (Project) project.clone();
        System.out.println(clone);
    }
}
