
public class Human {

    String name;
    int age;
    int salary;
    boolean isMarried;
    static int population = 0;

    Human() {
        name = "Unknown";
        age = 18;
        salary = 0;
        isMarried = false;
        population++;
    }

    Human(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        population++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append("Name: ").append(name).append(", ");
        sb.append("Age: ").append(age).append(", ");
        sb.append("Salary: ").append(salary).append(", ");
        sb.append("isMarried: ").append(isMarried).append(", ");
        sb.append("Population: ").append(population).append("}");
        return sb.toString();
    }
}
