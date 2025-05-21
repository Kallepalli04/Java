package day1;

public class test2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(i);	
		if(i==5) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
	}
public static void main(String[] args) {
	test2 t=new test2();
	Thread t2=new Thread();
	t2.start();
}
}
