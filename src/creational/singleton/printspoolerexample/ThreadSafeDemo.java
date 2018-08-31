package creational.singleton.printspoolerexample;

public class ThreadSafeDemo {

    public static void main(String[] args) {

        Thread threadOne = new Thread(() -> {PrintSpoolerThreadSafe s = PrintSpoolerThreadSafe.getInstance();});
        Thread threadTwo = new Thread(() -> {PrintSpoolerThreadSafe s = PrintSpoolerThreadSafe.getInstance();});

        threadOne.start();
        threadTwo.start();
    }
}

