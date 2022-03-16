import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class student {

    public String[] student_id = new String[100];
    public String[] student_name = new String[100];
    public String[] student_surname = new String[100];
    public static String path1 = "";



    public void student_information() throws FileNotFoundException {
        File file_student = new File("/home/ogr/b21627155/"+ path1);
        Scanner sc_student = new Scanner(file_student);

        int a = 0, bb = 0, cc = 0, dd = 0;

        while (sc_student.hasNext()) {
            if(a%3 == 0) {
                student_id[bb] = sc_student.next();
                bb++;
            }
            else if(a%3 == 1){
                student_name[cc] = sc_student.next();
                cc++;
            }
            else{
                student_surname[dd] = sc_student.next();
                dd++;
            }
            a++;
        }
    }

}
