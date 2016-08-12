package com.thetimg.mouseshare;

import java.awt.MouseInfo;

import com.thetimg.mouseshare.support.Mouse;

public class Driver {
	
	public static void main(String[] args){
		
		
		/**old
		new Thread (new Runnable(){
			public void run(){
				System.out.println(mc.toString());
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();**/
		
		while(true){
			new Thread(()-> {
				Mouse mc = new Mouse(MouseInfo.getPointerInfo());
				System.out.println(mc.toString());
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}).start();
		}
	}
	
}
