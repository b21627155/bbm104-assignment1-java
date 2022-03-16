import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class commands {
    grades grades1 = new grades();
    student student1 = new student();
    courses courses1 = new courses();

    public student getStudent1() {

        return student1;
    }

    public courses getCourses1() {

        return courses1;
    }

    public grades getGrades1() {

        return grades1;
    }

    ArrayList<String> commands_list = new ArrayList<String>();
    public static String path4 = "";

    public void commands_imformation(FileWriter output1) throws Exception {
        grades1.grades_information();
        student1.student_information();
        courses1.course_information();


        File file_command = new File("/home/ogr/b21627155/"+path4);
        Scanner sc_commands = new Scanner(file_command);


        while (sc_commands.hasNextLine()) {
            commands_list.add(sc_commands.nextLine());
        }
        for (int n = 0; n < commands_list.size(); n++) {
            //System.out.println(commands_list.get(n));
            String val = commands_list.get(n);
            String[] valle = val.split(" ");

            if(valle[0].equals("LIST")){
                if (valle[1].equals("COURSES")){
                    if (valle[2].equals("FOR")){
                        output1.write("COMMAND:\n");
                        output1.write(commands_list.get(n) + "\n");
                        output1.write("RESULT:"+ "\n");

                        for(int y = 0; y < grades1.student_id_mt1.size(); y++) {
                            if (grades1.student_id_mt1.get(y).equals(valle[4])) {
                                for(int k = 0; (k < courses1.course_id.length); k++){
                                    if(grades1.course_id_mt1.get(y).equals(courses1.course_id[k])){
                                        output1.write(courses1.course_id[k]+" "+courses1.course_name[k]+ "\n");
                                    }
                                }
                            }
                        }
                        for(int y = 0; y < grades1.student_id_mt2.size(); y++) {
                            if (grades1.student_id_mt2.get(y).equals(valle[4])) {
                                for(int k = 0; (k < courses1.course_id.length); k++){
                                    if(grades1.course_id_mt2.get(y).equals(courses1.course_id[k])){
                                        output1.write(courses1.course_id[k]+" "+courses1.course_name[k]+ "\n");
                                    }
                                }
                            }
                        }
                        output1.write(" "+ "\n");
                    }
                    else{
                        output1.write("COMMAND:"+ "\n");
                        output1.write(commands_list.get(n)+ "\n");
                        output1.write("RESULT:"+ "\n");

                        for(int f = 0; (f < courses1.course_id.length) && (courses1.course_id[f] != null); f++){
                            output1.write(courses1.course_id[f] +" "+ courses1.course_name[f]+ "\n");
                        }
                        output1.write(" "+ "\n");
                    }
                }
                else if(valle[1].equals("GRADES")){
                    if(valle[3].equals("COURSE")){
                        output1.write("COMMAND:"+ "\n");
                        output1.write(commands_list.get(n)+ "\n");
                        output1.write("RESULT:"+ "\n");

                        for(int f = 0; (f < grades1.course_id_mt1.size()); f++){
                            if(grades1.course_id_mt1.get(f).equals(valle[4]) && grades1.student_id_mt1.get(f).equals(valle[7])){
                                output1.write(grades1.midterm1_mt1.get(f) +" "+ grades1.final_mt1.get(f)+ "\n");
                            }
                        }
                        for(int f = 0; (f < grades1.course_id_mt2.size()); f++){
                            if(grades1.course_id_mt2.get(f).equals(valle[4]) && grades1.student_id_mt2.get(f).equals(valle[7])){
                                output1.write(grades1.midterm1_mt2.get(f) +" "+ grades1.midterm2_mt2.get(f) +" "+ grades1.final_mt2.get(f)+ "\n");
                            }
                        }
                        output1.write(" "+ "\n");
                    }
                    else{
                        output1.write("COMMAND:"+ "\n");
                        output1.write(commands_list.get(n)+ "\n");
                        output1.write("RESULT:"+ "\n");

                        for(int f = 0; (f < grades1.course_id_mt1.size()); f++) {
                            if (grades1.student_id_mt1.get(f).equals(valle[4])) {
                                output1.write(grades1.course_id_mt1.get(f) + " "+ grades1.midterm1_mt1.get(f) + " " + grades1.final_mt1.get(f)+ "\n");
                            }
                        }
                        for(int f = 0; (f < grades1.course_id_mt2.size()); f++) {
                            if (grades1.student_id_mt2.get(f).equals(valle[4])) {
                                output1.write(grades1.course_id_mt2.get(f) + " " + grades1.midterm1_mt2.get(f) + " " + grades1.midterm2_mt2.get(f) + " " + grades1.final_mt2.get(f)+ "\n");
                            }
                        }
                        output1.write(" "+ "\n");
                    }

                }
                else{
                    output1.write("COMMAND:"+ "\n");
                    output1.write(commands_list.get(n)+ "\n");
                    output1.write("RESULT:"+ "\n");

                    for(int y = 0; y < grades1.course_id_mt1.size(); y++) {
                        if (grades1.course_id_mt1.get(y).equals(valle[4])) {
                            for(int k = 0; (k < student1.student_id.length); k++){
                                if(grades1.student_id_mt1.get(y).equals(student1.student_id[k])){
                                    output1.write(student1.student_id[k] +" "+ student1.student_name[k] +" "+ student1.student_surname[k]+ "\n");
                                }
                            }
                        }
                    }
                    for(int y = 0; y < grades1.course_id_mt2.size(); y++) {
                        if (grades1.course_id_mt2.get(y).equals(valle[4])) {
                            for(int k = 0; (k < student1.student_id.length); k++){
                                if(grades1.student_id_mt2.get(y).equals(student1.student_id[k])){
                                    output1.write(student1.student_id[k] +" "+ student1.student_name[k] +" "+ student1.student_surname[k]+ "\n");
                                }
                            }

                        }
                    }
                    output1.write(" "+ "\n");
                }
            }

            else if(valle[0].equals("CALCULATE")){
                if (valle[1].equals("FINALGRADE")){
                    output1.write("COMMAND:"+ "\n");
                    output1.write(commands_list.get(n)+ "\n");
                    output1.write("RESULT:"+ "\n");

                    for(int v = 0; v < grades1.course_id_mt1.size(); v++){
                        if(grades1.course_id_mt1.get(v).equals(valle[4]) && grades1.student_id_mt1.get(v).equals(valle[7])){
                            output1.write(String.valueOf(grades1.average_mt1.get(v))+ "\n");
                        }
                    }

                    for(int v = 0; v < grades1.course_id_mt2.size(); v++){
                        if(grades1.course_id_mt2.get(v).equals(valle[4]) && grades1.student_id_mt2.get(v).equals(valle[7])){
                            output1.write(String.valueOf(grades1.average_mt2.get(v))+ "\n");
                        }
                    }
                    output1.write(" "+ "\n");
                }
                else if(valle[1].equals("AVERAGE")){
                    output1.write("COMMAND:"+ "\n");
                    output1.write(commands_list.get(n)+ "\n");
                    output1.write("RESULT:"+ "\n");

                    double aver_mid1 = 0.0;
                    double aver_mid2 = 0.0;
                    double aver_final = 0.0;
                    int counter = 0;
                    for(int m = 0; m < grades1.course_id_mt1.size(); m++){
                        if(grades1.course_id_mt1.get(m).equals(valle[5])){
                            aver_mid1 += Double.parseDouble(grades1.midterm1_mt1.get(m));
                            aver_final += Double.parseDouble(grades1.final_mt1.get(m));
                            counter ++;
                        }

                    }
                    if(aver_mid1>0.0){
                        output1.write(String.valueOf(aver_mid1/counter +" "+ aver_final/counter)+ "\n");
                    }
                    for(int m = 0; m < grades1.course_id_mt2.size(); m++){
                        if(grades1.course_id_mt2.get(m).equals(valle[5])){
                            aver_mid1 += Double.parseDouble(grades1.midterm1_mt2.get(m));
                            aver_mid2 += Double.parseDouble(grades1.midterm1_mt2.get(m));
                            aver_final += Double.parseDouble(grades1.final_mt2.get(m));
                            counter ++;
                        }

                    }
                    if (aver_mid2 > 0.0){
                        output1.write(String.valueOf(aver_mid1/counter +" "+aver_mid2/counter +" "+ aver_final/counter)+ "\n");
                    }
                    output1.write(" "+ "\n");

                }
                else{
                    output1.write("COMMAND:"+ "\n");
                    output1.write(commands_list.get(n)+ "\n");
                    output1.write("RESULT:"+ "\n");

                    for(int s = 0; s < grades1.student_id_mt1.size(); s++){
                        if(grades1.student_id_mt1.get(s).equals(valle[5])){
                            output1.write(grades1.course_id_mt1.get(s) +" "+ String.valueOf(grades1.average_mt1.get(s))+ "\n");
                        }
                    }
                    for(int s = 0; s < grades1.student_id_mt2.size(); s++){
                        if(grades1.student_id_mt2.get(s).equals(valle[5])){
                            output1.write(grades1.course_id_mt2.get(s) +" "+ String.valueOf(grades1.average_mt2.get(s))+ "\n");
                        }
                    }

                    output1.write(" "+ "\n");

                }

            }
            else{
                output1.write("COMMAND:"+ "\n");
                output1.write(commands_list.get(n)+ "\n");
                output1.write("RESULT:"+ "\n");

                ArrayList<Double> average_y = new ArrayList<Double>();
                for(int u = 0; u < grades1.course_id_mt1.size(); u++) {
                    if (grades1.course_id_mt1.get(u).equals(valle[4])) {
                        average_y.add(grades1.average_mt1.get(u));
                    }
                }

                for(int j = 0; j < grades1.course_id_mt1.size(); j++){
                    if (grades1.course_id_mt1.get(j).equals(valle[4])){
                        if(grades1.average_mt1.get(j).equals(Collections.max(average_y))){
                            for(int t = 0; t < student1.student_id.length; t++){
                                if(grades1.student_id_mt1.get(j).equals(student1.student_id[t])){
                                    output1.write(student1.student_id[t] +" "+ student1.student_name[t] +" "+ student1.student_surname[t] +" "+ String.valueOf(grades1.average_mt1.get(j))+ "\n");
                                }
                            }
                        }

                    }

                }

                ArrayList<Double> average_x = new ArrayList<Double>();
                for(int u = 0; u < grades1.course_id_mt2.size(); u++) {
                    if (grades1.course_id_mt2.get(u).equals(valle[4])) {
                        average_x.add(grades1.average_mt2.get(u));
                    }
                }

                for(int j = 0; j < grades1.course_id_mt2.size(); j++){
                    if (grades1.course_id_mt2.get(j).equals(valle[4])){
                        if(grades1.average_mt2.get(j).equals(Collections.max(average_x))){
                            for(int t = 0; t < student1.student_id.length; t++){
                                if(grades1.student_id_mt2.get(j).equals(student1.student_id[t])){
                                    output1.write(student1.student_id[t] +" "+ student1.student_name[t] +" "+ student1.student_surname[t] +" "+ String.valueOf(grades1.average_mt2.get(j))+ "\n");
                                }
                            }
                        }

                    }

                }
                output1.write(" "+ "\n");

            }

        }

    }
}
