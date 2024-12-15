package ovh.neziw.patterns;

final class SingletonExample {

    public static void main(final String[] args) {
        final Singleton singleton = Singleton.getInstance();
        singleton.write("Hello, Singleton!");

        new Thread(() -> Singleton.getInstance().write("Hello, Singleton from another thread!")).start();
        new Thread(() -> Singleton.getInstance().write("Hello, Singleton from another thread again!")).start();

        singleton.write("Application finished. Exiting...");
        System.exit(0);
    }
}