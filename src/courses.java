import java.io.File;
import java.util.Scanner;

public class courses {
    public String[] course_id = new String[100];
    public String[] course_name = new String[100];
    public static String path2 = "";

    public void course_information() throws Exception{
        File file_courses = new File("/home/ogr/b21627155/" + path2); ///home/ogr/b21627155/courses.txt
        Scanner sc_coureses = new Scanner(file_courses);


        int b = 0, xx = 0, yy = 0;

        while(sc_coureses.hasNextLine()){

            if(b%2 == 0){
                course_id[xx] = sc_coureses.next();
                xx++;
            }
            else{
                course_name[yy] = sc_coureses.next();
                yy++;
            }
            b++;
        }
    }
}
