package Lab51;

import java.io.File;

public class Lab51 {
    public static void main(String[]args) {
        try {
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Файл создан!");
                System.out.println("Полный путь 1 : " + f1.getAbsolutePath());
            }
            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2 : " + f2.getAbsolutePath());

            File f3 = new File("E:\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь 3 : " + f3.getAbsolutePath());
        }
        catch (Exception e) {
            System.out.println("Ошибка! " + e);
        }
    }
}
