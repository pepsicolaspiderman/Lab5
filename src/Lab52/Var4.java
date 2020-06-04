package Lab52;

import java.io.*;
import java.util.Scanner;

public class Var4 {
    public static void main(String[] args) throws IOException {
        try {
            File f1 = new File("E:\\My\\numFloat.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");

            DataOutputStream wr =
                    new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));

            System.out.println("Сколько чисел типа float записать в файл?");
            int count = sc.nextInt();

            System.out.println("Введите числа: ");
            for (int i = 0; i < count; i++)
                wr.writeFloat(sc.nextFloat());
            wr.flush();
            wr.close();

            File f2 = new File("E:\\My\\numFloatSecond.txt");
            f2.createNewFile();

            DataInputStream rd =
                    new DataInputStream(new FileInputStream(f1.getAbsolutePath()));

            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    for (int n = 0; n < count; n++) {
                        if ((float)number < 0) {
                            wr.writeFloat(number);
                            System.out.println("Число " + (float)number);
                        }
                        System.out.println("Всего отрицательных чисел: " + n);
                    }
                }
            }
            catch(EOFException e) {}
            wr.flush();
            wr.close();
            wr.close();
        }
        catch (IOException e) {
            System.out.println("End of file");
        }
    }
}
