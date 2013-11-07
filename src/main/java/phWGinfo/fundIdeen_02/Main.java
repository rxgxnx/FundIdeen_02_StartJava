package phWGinfo.fundIdeen_02;

import java.io.File;

/**
 *
 */
public class Main {

    public static void main(String[] args) throws Throwable {
        File file = new File("LICENSE");
        System.out.println(file.exists());
        file=file.getAbsoluteFile();

        File file2 = file.getParentFile();
        System.out.println(file2.getName());
        System.out.println(file2.equals(file));

    }

}
