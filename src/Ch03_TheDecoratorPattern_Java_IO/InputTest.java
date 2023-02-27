package Ch03_TheDecoratorPattern_Java_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) throws IOException {
//        System.out.println(System.getProperty("user.dir"));
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/home/george/IdeaProjects/Head_First_Design_Patterns_Documentation/src/Ch03_TheDecoratorPattern_Java_IO/test.txt")
                    )
            );
            while((c = in.read()) >= 0)
                System.out.print((char) c);
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
