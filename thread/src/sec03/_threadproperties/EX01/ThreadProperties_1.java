package sec03._threadproperties.EX01;
//쓰레드 객체 가져오기 / 이름 설정/ 쓰레드 수
public class ThreadProperties_1 {
public static void main(String[] args) {
	//currentThread() 정적메서드 객체 가져오기
	Thread curThread = Thread.currentThread();
	System.out.println("현재 쓰레드의 이름= "+curThread.getName());
	System.out.println("동작하는 쓰레드 수= "+Thread.activeCount());
	
	//쓰레드 이름 자동지정 
	for(int i=0; i<3; i++) {
		Thread thread = new Thread();
		System.out.println(thread.getName());
		thread.start();
	}
	
	//쓰레드 이름 직접지정
	for(int i=0; i<3; i++) {
		Thread thread = new Thread();
		thread.setName(i+"번째 쓰레드");
		System.out.println(thread.getName());
		thread.start();
	}
	//쓰레드 이름 자동지정 +추가분
	for(int i=0; i<3; i++) {
		Thread thread = new Thread();
		System.out.println(thread.getName());
		thread.start();
	}
	//쓰레드 수 계속 바뀜 현재 실시간으로 동작하는 쓰레드 수
	System.out.println("동작하는 쓰레드 수= "+Thread.activeCount());
}
}
