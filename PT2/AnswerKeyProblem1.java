import java.util.regex.*;
import java.io.*;

public class AnswerKeyProblem1 {

   
    static String finalAnswers(String answers){
        String a,b,c,d;
        a=answers.replace('e', 'b');
        b=a.replace('E', 'A');
        c=b.replace('f', 'c');
        d=c.replace('F', 'D');
        System.out.println("The answers are: ");
        for (int i = 0; i < d.length(); i++) {
            char x= d.charAt(i);
            char y=Character.toLowerCase(x);
            System.out.println(y);
        }
        return d;
    }

    public static void main(String args[]) throws IOException {
        String answers = "";

        BufferedReader codedAnswers = new BufferedReader(
                new FileReader(new File("E:/ACAD/OOP/LAB/PT2/CodedAnswerKey.txt")));

        String line = codedAnswers.readLine();

        while (line != null) {
            if (line.matches("[a-fA-F]")) {
                answers = answers + line;
            }

            line = codedAnswers.readLine();
        }

        System.out.println("The answers are: ");
        for (int i = 0; i < answers.length(); i++) {
            System.out.println(answers.charAt(i));
        }
        
        finalAnswers(answers);
    }


}