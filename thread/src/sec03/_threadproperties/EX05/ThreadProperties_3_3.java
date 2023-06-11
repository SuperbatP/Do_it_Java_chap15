package sec03._threadproperties.EX05;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+" : "+(isDaemon()? "데몬쓰레드":"일반쓰레드"));
		for(int i=0; i<6; i++) {
			System.out.println(getName()+" : "+ i +"초");
			try{Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_3 {
public static void main(String[] args) {
	//일반쓰레드
	Thread thread1=new MyThread();
	thread1.setDaemon(false);//디폴트
	thread1.setName("thread1");
	thread1.start();
	
	//데몬쓰레드:모든 쓰레드가 끝날 때 종결 main,일반 상관없음
	Thread thread2=new MyThread();
	thread2.setDaemon(true);
	thread2.setName("thread2");
	thread2.start();
	
	//3초후 main 쓰레드 종료
	try {Thread.sleep(3100);
	} catch (InterruptedException e) {}
	System.out.println("메인 쓰레드 종료");
	}
	
}

