package codes.threading;

class Student {
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public int incrementAge(){
        /*
        synchronized (name){
            // When you use synchronized (name), you're saying: "Any thread that wants to execute this code block must acquire the monitor lock associated with the name object."
            // Monitor lock
            // also called intrinsic lock or mutex
            // No fair scheduling (threads can "starve" waiting for the lock)
            // No timeout capability (threads wait indefinitely)
            this.age += 1;
        }
        */
        synchronized (this){
            this.age++;
        }
        return age;
    }
}

class Task3 implements Runnable{

    Student s;
    Task3(Student s){
        this.s = s;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            s.incrementAge();
        }
    }
}
public class SynchronizedKeyword {
    public static void main(String[] args) throws InterruptedException {
        Student s = new Student("kartikey", 0);
        Thread t1 = new Thread(new Task3(s));
        Thread t2 = new Thread(new Task3(s));
        Thread t3 = new Thread(new Task3(s));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(s.getAge());
    }
}
