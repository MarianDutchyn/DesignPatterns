package creational.prototype;

public class Project implements Prototype{

    private int id;
    private String projectName;
    private int price;

    public Project() {
    }

    public Project(int id, String projectName, int price) {
        this.id = id;
        this.projectName = projectName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Object clone() {
        Project clone = new Project(id, projectName, price);
        return clone;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", price=" + price +
                '}';
    }
}
