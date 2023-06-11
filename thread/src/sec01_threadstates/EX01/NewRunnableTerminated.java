package sec01_threadstates.EX01;

public class NewRunnableTerminated {
public static void main(String[] args) {
	//쓰레드 상태 저장 클래스
	Thread.State state;
	
	//1.객체생성-new
	Thread thread = new Thread() {
		public void run() {
			for(long i=0; i<100000000L; i++) {}
		};
	};
	state = thread.getState();
	System.out.println("thread state = "+state);

	//2. Thread 시작
	thread.start();
	state = thread.getState();
	System.out.println("thread state = "+state);
	
	//2. Thread 종료
	try {thread.join();} 
	catch (InterruptedException e) {}
	state = thread.getState();
	System.out.println("thread state = "+state);
	
}
}
