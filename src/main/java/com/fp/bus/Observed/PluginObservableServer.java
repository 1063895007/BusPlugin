package com.fp.bus.Observed;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 被观察者，也就是微信公众号服务 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * 
 * @author jstao
 *
 */
public class PluginObservableServer extends Observable {

	public void setInfomation(String... s) {
		System.out.println("向观察者发送消息");
		for (String json : s) {
			System.out.println("被观察者发送的消息： " + json);
			// 标记此 Observable对象为已改变的对象
			setChanged();
			// 消息更新，通知所有观察者
			notifyObservers(json);
		}
	}

}
