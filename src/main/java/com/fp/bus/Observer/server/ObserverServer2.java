package com.fp.bus.Observer.server;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * 
 * @author wwwfp
 *
 */
public class ObserverServer2 implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("观察者" + 2 + "收到消息：" + arg);
	}

}
