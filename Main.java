public class Main {



    public static void main(String[]args){

        for(int i = 3; i > 0; i--){
            RunnableTrial R = new RunnableTrial("Thread " + i);
            R.start();

        }

    }
}
