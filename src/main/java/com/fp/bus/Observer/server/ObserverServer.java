package com.fp.bus.Observer.server;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import com.fp.bus.Observed.PluginObservableServer;

/**
 * 观察者
 * 
 * @author wwwfp
 *
 */
public class ObserverServer implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("观察者" + 1 + "收到消息：" + arg);
		Map<String,Object> map = (Map<String, Object>) arg;
		String bus = (String) map.get("bus");
		System.out.println("bus:"+bus);
		Observer hostObserver = (Observer) map.get("hostObserver");
		System.out.println("hostObserver:"+hostObserver);
		PluginObservableServer pluginObservableServer = new PluginObservableServer();
		pluginObservableServer.addObserver(hostObserver);
		pluginObservableServer.setInfomation("插件已经接受到数据");
		pluginObservableServer.deleteObserver(hostObserver);
	}

}
