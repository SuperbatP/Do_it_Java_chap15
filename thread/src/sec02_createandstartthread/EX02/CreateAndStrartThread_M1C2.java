package sec02_createandstartthread.EX02;
//방법1. Thread 클래스 상속하여 클래스 생성-3개의 쓰레드 생성
class SMIFileThread extends Thread{//Thread1
	@Override
	public void run() {
	String[] strArray= {"하나","둘","셋","넷","다섯"};
	try {Thread.sleep(10);} catch (InterruptedException e) {}
	for(int i=0; i<strArray.length; i++) {System.out.println(" - (자막번호)"+strArray[i]);
	try {Thread.sleep(200);} catch (InterruptedException e) {}
	}
	}
}

class VideoFileThread extends Thread{//Thread2
	@Override
	public void run() {
	int [] intArray= {1,2,3,4,5};
	for(int i=0; i<intArray.length; i++) {System.out.print("(비디오프레임)"+intArray[i]);
	try {Thread.sleep(200);} catch (InterruptedException e) {}
	}
	}
}
	
public class CreateAndStrartThread_M1C2 {
	public static void main(String[] args) {//Thread3
		//SMIFileThread 객체 생성 및 시작
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		//VideoFileThread 객체 생성 및 시작
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.start();
		
		
			
	}
}
