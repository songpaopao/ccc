package creational.singleton.printspoolerexample;

public class ResourceManager {

    public static void main(String[] args) {

        // Print statement inside the init method only gets called once
        PrintSpooler spooler1 = PrintSpooler.getInstance();
        PrintSpooler spooler2 = PrintSpooler.getInstance();
    }
}

