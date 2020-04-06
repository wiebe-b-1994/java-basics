import java.util.ArrayList;
import java.util.List;

public class Exercise27 {

    public static void main(String args[]) {

        List<Double> scores = new ArrayList();

        double rand_score = 0, value = 0;

        int students = 0;

        for (int i = 0; i < 20; i++) {
            rand_score = (Math.random() * ((100 - 1) + 1) + 1);
            value = Math.round(rand_score);
            scores.add(value);

            if (value <= 90.0 && value >= 85.0) {
                students++;
            }
        }
        System.out.println(students);
    }
}
