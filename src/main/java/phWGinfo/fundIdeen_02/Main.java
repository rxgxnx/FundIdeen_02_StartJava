package phWGinfo.fundIdeen_01_SimpleSearch;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.lang.String;
import java.util.List;

/**
 * Eine einfache Programme um in einer Textdatei nach einem Satz zu suchen.
 */
public class SimpleSearch {

    public static void main(String[] args) throws Throwable {
        List<String> lines = FileUtils.readLines(new File(new File("data"),
                "Lebensansichten_des_Katers_Murr.txt"));
        System.out.println("Datei gelesen.");

        String anfrage = "Kreisler";
        for(String line: lines ) {
            if(line.contains("A"))
                System.out.println(line);
        }

    }

}