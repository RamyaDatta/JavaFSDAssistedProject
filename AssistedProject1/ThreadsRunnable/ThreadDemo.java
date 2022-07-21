package simplilearnThreads;

public class ThreadDemo extends Thread {
	
 	public void run()
 	{
  		System.out.println("Concurrent thread started running..");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

  		ThreadDemo mt = new  ThreadDemo();
  		mt.start();

		

	}

}
