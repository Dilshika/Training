package Singleton;

import java.awt.PrintJob;

public class Application {
    public static void main(String[] args) {
        FileReaderManager fileReaderManager=FileReaderManager.getInstance();
        System.out.println(fileReaderManager);

        FileReaderManager fileReaderManager1=FileReaderManager.getInstance();
        System.out.println(fileReaderManager1);
    }
}
