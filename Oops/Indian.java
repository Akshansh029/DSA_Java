
public class Indian extends Human {

    static int indianPopulation = 0;

    Indian() {
        name = "Unknown";
        age = 18;
        salary = 0;
        isMarried = false;
        indianPopulation++;
    }

    Indian(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        indianPopulation++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append("Name: ").append(name).append(", ");
        sb.append("Age: ").append(age).append(", ");
        sb.append("Salary: ").append(salary).append(", ");
        sb.append("isMarried: ").append(isMarried).append(", ");
        sb.append("Population: ").append(population).append(", ");
        sb.append("Population of India: ").append(indianPopulation).append("}");
        return sb.toString();
    }
}
