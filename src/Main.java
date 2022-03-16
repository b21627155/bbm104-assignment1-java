
import java.io.FileWriter;

public class Main {

    public static void main(String[] args)  throws Exception{
        String args0=args[0], args1=args[1], args2=args[2], args3=args[3];

        FileWriter output = new FileWriter(args[4]);

        student.path1 = args0;
        courses.path2 = args1;
        grades.path3 = args2;
        commands.path4 = args3;


        commands command1 = new commands();
        command1.commands_imformation(output);

        output.close();

    }

}
