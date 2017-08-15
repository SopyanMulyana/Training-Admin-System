import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Object;
import java.lang.Object;
import java.lang.Object;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
public class Stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("textinput.txt");
            out = new FileOutputStream("textoutput.txt");
            int c;
            String text="";
            String satuan[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",};
            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println(c);
                if (c>=48 && c<=57)
                {
                	text += satuan[c-48];
                }
                else
                {
                	text += " ";
                }
            }
            try(  PrintWriter prin = new PrintWriter( "textconvert.txt" )  ){
                prin.println( text );
            }
            
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
	}

}
