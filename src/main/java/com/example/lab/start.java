package com.example.lab;

import com.example.lab.Listener.CacheListener;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class start implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		startCacheListener();
	}

	public void startCacheListener() {
		CacheListener cacheListener = new CacheListener();
		cacheListener.startListen();
	}

}
