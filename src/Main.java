import com.example.libs.Calc;
import com.example.libs.Employee;
import com.example.libs.Input;
import com.example.libs.Sort;

public class Main {
	public static void main(String[] args) {
		Employee [] array = new Employee[10];
		Input input = new Input(array);
		int count = input.input();
		
		Calc calc = new Calc(array,count);
		calc.calc();
		
		Sort sort = new Sort(array, count);
		sort.selectionSort();
		
		Output output = new Output(array, count);
		output.output();
	}
}
