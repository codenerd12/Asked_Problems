package com.problems;

public class WaitAndNotify{
	
	static int i=1;
	
	public void printOddNumbers() {
		
		synchronized (this) {
			
			try {
				while(i<=100) {
					
					if(i%2==0) {
						wait();
					} 
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"->  "+i);
					i++;
					notify();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	public void printEvenNumbers() {
		
		synchronized (this) {
			
			try {
				while(i<=100) {
					
					if(i%2!=0) {
						wait();
					}
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"->  "+i);
					i++;
					notify();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaitAndNotify te = new WaitAndNotify();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				te.printOddNumbers();
			}
		}, "Thread 1");
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				te.printEvenNumbers();
			}
		}, "Thread 2");
		
		t1.start();
		t2.start();

	}

}
