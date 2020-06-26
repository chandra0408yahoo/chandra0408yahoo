package Seleniumstartup;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class writeoutput {

    public static void main(String args[]) throws IOException {
        FileOutputStream fos = new FileOutputStream("fileName");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));


            bw.write("something");
            bw.newLine();

        bw.close();

    }

}
