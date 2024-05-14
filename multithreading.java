
class thread1 extends Thread {
    public void run() {
        System.out.println("Run method");
    }
}

class therad2 extends Thread {
    public void run() {
        System.out.println("Run method 2");
    }
}

class thread3 extends Thread {
    public void run() {
        System.out.println("Run method 3");
    }
}

public class multithreading {
    public static void main(String[] args) {
        thread1 t = new thread1();
        therad2 t2 = new therad2();
        thread3 t3 = new thread3();
        t.start();
        t2.start();
        t3.start();
    }

}
