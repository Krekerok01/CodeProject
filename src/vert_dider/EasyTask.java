package vert_dider;

import java.io.IOException;

public class EasyTask {
    public static void main(String[] args) throws IOException {
        int number = Helper.readInt();

        do {
            Helper.printMessage(String.valueOf(number));
            if (number % 2 == 0){
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
        } while (number != 1);

    }
}
