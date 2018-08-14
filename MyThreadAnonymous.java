public class MyThreadAnonymous{


public static void main (String[] args){

Runnable runnable = new Runnable(){
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Anonymous inner class: Child thread.");
		}
	}

};

Thread thread = new Thread(runnable);
thread.start();

for(int i=0; i<10; i++){
	System.out.println("Anonymous inner class: Main thread");
}

}

}