import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.round;

public class grades {
    public ArrayList<String> withMidterm_1 = new ArrayList<String>();
    public ArrayList<String> withMidterm_2 = new ArrayList<String>();

    public ArrayList<String> course_id_mt1 = new ArrayList<String>();
    public ArrayList<String> student_id_mt1 = new ArrayList<String>();
    public ArrayList<String> midterm1_mt1 = new ArrayList<String>();
    public ArrayList<String> final_mt1 = new ArrayList<String>();
    public ArrayList<Double> average_mt1 = new ArrayList<Double>();

    public ArrayList<String> course_id_mt2 = new ArrayList<String>();
    public ArrayList<String> student_id_mt2 = new ArrayList<String>();
    public ArrayList<String> midterm1_mt2 = new ArrayList<String>();
    public ArrayList<String> midterm2_mt2 = new ArrayList<String>();
    public ArrayList<String> final_mt2 = new ArrayList<String>();
    public ArrayList<Double> average_mt2 = new ArrayList<Double>();

    public static String path3 = "";

    public void grades_information() throws Exception {
        File file_grade = new File("/home/ogr/b21627155/" + path3);
        Scanner sc_grades = new Scanner(file_grade);


        while (sc_grades.hasNextLine()) {
            String value = sc_grades.nextLine();
            int count = 1;
            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) == ' ') {
                    count++;
                }
            }

            if (count == 4) {
                withMidterm_1.add(value);
            } else {
                withMidterm_2.add(value);
            }
        }
        for(int k=0; k<withMidterm_1.size(); k++){
            String[] key = withMidterm_1.get(k).split(" ");
            course_id_mt1.add(key[0]);
            student_id_mt1.add(key[1]);
            midterm1_mt1.add(key[2]);
            final_mt1.add(key[3]);
            int mt1 = Integer.parseInt(midterm1_mt1.get(k));
            int fi1 = Integer.parseInt(final_mt1.get(k));
            double aver = 2*mt1/5.0 + 3*fi1/5.0;
            average_mt1.add(aver);

        }
        for(int y=0; y<withMidterm_2.size(); y++){
            String[] key1 = withMidterm_2.get(y).split(" ");
            course_id_mt2.add(key1[0]);
            student_id_mt2.add(key1[1]);
            midterm1_mt2.add(key1[2]);
            midterm2_mt2.add(key1[3]);
            final_mt2.add(key1[4]);
            int mt1 = Integer.parseInt(midterm1_mt2.get(y));
            int mt2 = Integer.parseInt(midterm2_mt2.get(y));
            int fi1 = Integer.parseInt(final_mt2.get(y));
            double aver = (mt1 + mt2)/4.0 + fi1/2.0;
            average_mt2.add(aver);

        }
    }
}
