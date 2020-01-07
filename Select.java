package thread;

public class Select implements Runnable{
	static int i=0;
	public void test(){
		 System.out.println("当前线程为："+i);
		 i++;
	}
	public synchronized void run(){
		test();
	}
	public static void main(String[] args){
		Select se=new Select();
		for(int f=0;f<10;f++){
			Thread thread=new Thread(se);
			thread.start();
		}
	}

}
