package comparson;
import java.util.Comparator;
class ComparatorLogicClass implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.id - e2.id;
    }
}