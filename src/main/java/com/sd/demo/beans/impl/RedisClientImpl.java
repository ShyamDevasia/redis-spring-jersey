package com.sd.demo.beans.impl;


import com.sd.demo.beans.RedisClient;

import redis.clients.jedis.Jedis;

public class RedisClientImpl implements RedisClient {
	
	private Jedis jedis;
	
	public RedisClientImpl() {
		jedis = new Jedis();
	}


	public Jedis getJedis() {
		return jedis;
	}

	public void setJedis(Jedis jedis) {
		this.jedis = jedis;
	}
	
	

}