package vert_dider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static int readInt() throws IOException {
        System.out.println("Please, enter a number: ");
        String num = reader.readLine();

        int n;

        while (true) {
            try {
                n = Integer.parseInt(num);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a valid data: ");
            }
        }
        return n;
    }

    public static void printMessage(String message){
        System.out.println(message);
    }
}
