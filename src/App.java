import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        String path = "C:\\Users\\kazuo\\Documents";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("ファイルが見つかりません" + e.getMessage());
        }
    }
}
