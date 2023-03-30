package com.example.lab.Util;

import com.example.lab.Entity.EntityCache;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CacheManagerUtil {
	private static Map<String, EntityCache> caches = new ConcurrentHashMap<String, EntityCache>();

	/**
	 * 存入缓存
	 * @param key
	 * @param cache
	 */
	private static void putCache(String key, EntityCache cache) {
		caches.put(key, cache);
	}

	/**
	 * 存入缓存
	 * @param key
	 * @param cache
	 */
	public static void putCache(String key, Object datas, long timeOut) {
		timeOut = timeOut > 0 ? timeOut : 0L;
		putCache(key, new EntityCache(datas, timeOut, System.currentTimeMillis()));
	}

	/**
	 * 获取对应缓存
	 * @param key
	 * @return
	 */
	public static EntityCache getCacheByKey(String key) {
		if (isContains(key)) {
			return caches.get(key);
		}
		return null;
	}

	/**
	 * 获取对应缓存
	 * @param key
	 * @return
	 */
	public static Object getCacheDataByKey(String key) {
		if (isContains(key)) {
			return caches.get(key).getDatas();
		}
		return null;
	}

	/**
	 * 获取所有缓存
	 * @param key
	 * @return
	 */
	public static Map<String, EntityCache> getCacheAll() {
		return caches;
	}

	/**
	 * 判断是否在缓存中
	 * @param key
	 * @return
	 */
	public static boolean isContains(String key) {
		return caches.containsKey(key);
	}

	/**
	 * 清除所有缓存
	 */
	public static void clearAll() {
		caches.clear();
	}

	/**
	 * 清除对应缓存
	 * @param key
	 */
	public static void clearByKey(String key) {
		if (isContains(key)) {
			System.out.println(key + " 缓存被清除");
			caches.remove(key);
		}
	}

	/**
	 * 缓存是否超时失效
	 * @param key
	 * @return
	 */
	public static boolean isTimeOut(String key) {
		if (!caches.containsKey(key)) {
			return true;
		}
		EntityCache cache = caches.get(key);
		long timeOut = cache.getTimeOut();
		if(timeOut == 0) {
			//为0，永不失效
			return false;
		}
		long lastRefreshTime = cache.getLastRefeshTime();
		if (timeOut != 0 && System.currentTimeMillis() - lastRefreshTime >= timeOut) {
			return true;
		}
		return false;
	}

	/**
	 * 获取所有key
	 * @return
	 */
	public static Set<String>  getAllKeys() {
		return caches.keySet();
	}

	public static void refreshTime(String key){
		if (isContains(key)) {
			caches.get(key).setLastRefeshTime(System.currentTimeMillis());
		}
	}
}
