import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientSir {

    public static void main(String args[]) throws IOException {
        try(Socket s = new Socket("127.0.0.1",2000);
            PrintWriter out = new PrintWriter(s.getOutputStream());
            Scanner in = new Scanner(s.getInputStream())) {

            Scanner sc = new Scanner(System.in);
            System.out.println( in.nextLine() );
            while(true) {
                String line = sc.nextLine();
                out.println(line);
                out.flush();
                String response = in.nextLine();
                System.out.println(response);
            }
        }
    }

}
