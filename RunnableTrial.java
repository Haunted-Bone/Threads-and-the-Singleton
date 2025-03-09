class RunnableTrial implements Runnable {


    public Thread t;
    public String ThreadName;

    RunnableTrial(String name){
        ThreadName = name;
        System.out.println("Creating " + ThreadName);
    }

    public void run() {
        System.out.println("Running " + ThreadName);
        try{
            for(int i = 4; i > 0; i--){

                System.out.println("Thread: " + ThreadName + ", " + i);

                Thread.sleep(50);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread: " + ThreadName + " Interrupted.");
        }
        System.out.println("Thread: " + ThreadName + " Exiting");

    }

    public void start(){

        System.out.println("Starting " + ThreadName);
        if (t == null) {
            t = new Thread(this, ThreadName);
            t.start();
        }

    }
}