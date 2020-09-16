package Section_8.Lesson1;

import java.io.File;

public class Lesson1 {
    public static void main(String[] args) {
        File file = new File("src/Selection_8/Lesson1/Lesson1.java");
        System.out.println("Файл доступен для чтения - " + file.canRead());
        System.out.println("Файл доступен для записи - " + file.canWrite());
        System.out.println("Файл cуществует - " + file.exists());
        System.out.println("Полный путь - " + file.getAbsolutePath());
        System.out.println("Имя файла - " + file.getName());
        System.out.println("Название родительского файла - " + file.getParent());
        System.out.println("Это файл - " + file.isFile());
        System.out.println("Это директория - " + file.isDirectory());
        System.out.println("Пследнее время изменения файла - " + file.lastModified());
        File parant = file.getAbsoluteFile().getParentFile().getParentFile().getParentFile().getParentFile();
        System.out.println(parant.getAbsolutePath());
        File[]files = parant.listFiles();
        for (File f:files) {
            System.out.println("_____________________");
            System.out.println(f);
            System.out.println("Размер файла - "+f.length());
            System.out.println("Это файл - " + f.isFile());
        }

    }
}
