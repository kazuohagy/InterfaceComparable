import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\kazuo\\Documents\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(new Employee(line.split(",")[0], Double.parseDouble(line.split(",")[1])));
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("ファイルが見つかりません" + e.getMessage());
        }
    }
}
