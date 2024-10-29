
public class NewZealander extends Human {

    static int newZealandPopulation = 0;

    NewZealander() {
        name = "Unknown";
        age = 18;
        salary = 0;
        isMarried = false;
        newZealandPopulation++;
    }

    NewZealander(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        newZealandPopulation++;
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
        sb.append("Population of New Zealand: ").append(newZealandPopulation).append("}");
        return sb.toString();
    }
}
