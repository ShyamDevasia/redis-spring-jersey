package com.sd.demo.beans;

import redis.clients.jedis.Jedis;

public interface RedisClient{
 
	Jedis getJedis();
	void setJedis(Jedis jedis);
 
}