
class A extends Thread {
    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            System.out.println("hii");
        }

    }
}

class B extends Thread {
    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            System.out.println("hello");

        }

    }
}

public class multipleThreads {
    public static void main(String[] args) {

        A obj2 = new A();
        B obj1 = new B();

        /*
         * in built method for knowing priority least is 1 by default 5 and highest is
         * 10 for every thread
         */
        System.out.println(obj1.getPriority());

        /*
         * setting priority doesnot mean scheduller will give the priority its just a
         * suggestion for scheduller
         */
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();

        /*
         * thread sleep allows the running thread in waiting stage for the sometime
         * given by programmer
         * he can only optimize the running threads by thread sleep not
         * control the scheduling
         */
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        obj2.start();

        /*
         * will be get executed before the threads as main was already running and start
         * just signals to create thread
         */
        System.out.println(obj2.getPriority());
    }
}
