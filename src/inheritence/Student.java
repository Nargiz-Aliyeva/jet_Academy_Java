package inheritence;

public class Student extends Human{
    private String universirt;

    public String getUniversirt() {
        return universirt;
    }

    @Override
    public String toString() {
        return "inheritence.Student{" +
                "universirt='" + getUniversirt() + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    public void setUniversirt(String universirt) {
        this.universirt = universirt;

    }
}
