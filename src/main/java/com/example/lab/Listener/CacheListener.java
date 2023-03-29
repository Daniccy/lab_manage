package com.example.lab.Listener;

import com.example.lab.Util.CacheManagerUtil;

public class CacheListener {

	public void startListen() {
		new Thread() {
			public void run() {
				while (true) {
					for (String key : CacheManagerUtil.getAllKeys()) {
						if (CacheManagerUtil.isTimeOut(key)) {
							CacheManagerUtil.clearByKey(key);
						}
					}
				}
			}
		}.start();
	}
}
