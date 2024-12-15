package ovh.neziw.patterns;

import java.io.PrintWriter;

class Singleton {

    private static Singleton instance;
    private final PrintWriter printWriter;

    private Singleton() {
        this.printWriter = new PrintWriter(System.out, true);
    }

    public void write(final String message) {
        this.printWriter.println(message);
    }

    public void closeWriter() {
        this.printWriter.close();
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}