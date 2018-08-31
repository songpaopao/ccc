package creational.singleton.printspoolerexample;

public class PrintSpoolerThreadSafe {

    private static PrintSpoolerThreadSafe spooler;

    private static boolean initialized = false;

    private PrintSpoolerThreadSafe() {}

    private void init() {
        System.out.println("Initialized the class");
    }

    public static synchronized PrintSpoolerThreadSafe getInstance() {
        if (initialized) return spooler;

        spooler = new PrintSpoolerThreadSafe();
        spooler.init();
        initialized = true;

        return spooler;
    }
}

