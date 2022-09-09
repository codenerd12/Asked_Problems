package com.problems;

class Resource1 {
	
	static int[] buff = new int[5];
	static int i = 0;
	static int j = 0;
	static int num = 1;
	
	public synchronized void prod() {
		
		try {
			while(true) {
				
				if(i==5) {
					j=0;
					wait();
				}
				System.out.println("Producer: "+num);
				buff[i] = num++;
				i++;
				notify();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
		
	}
	
	public synchronized void cons() {
		
		try {
			while(true) {
				
				if(j==5) {
					i = 0;
					wait();
				}
				
				
				System.out.println("Consumer: "+buff[j]);
				j++;
				notify();
				Thread.sleep(1000);
			}
		} catch (Exception e) {

		
		}
		
	}
}

public class ProducerAndConsumer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Resource1 res = new Resource1();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				res.prod();
			}
		}, "t1");
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				res.cons();
			}
		}, "t2");
		
		
		t1.start();
		t2.start();
		
	}

}
