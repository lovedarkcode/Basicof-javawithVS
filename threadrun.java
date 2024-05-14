
class demothread implements Runnable {
    public void run() {

        System.out.println("run method");
    }

}

public class threadrun {
    public static void main(String[] args) {
        demothread d = new demothread();
        Thread t = new Thread(d);
        t.start();
    }

}
