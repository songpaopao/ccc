package creational.singleton.printspoolerexample;

public class PrintSpooler {

    private static PrintSpooler spooler;

    private static boolean initialized = false;

    private PrintSpooler() {}

    private void init() {
        System.out.println("Initialized the class");
    }

    public static PrintSpooler getInstance() {
        if (initialized) return spooler;

        spooler = new PrintSpooler();
        spooler.init();
        initialized = true;

        return spooler;
    }
}
