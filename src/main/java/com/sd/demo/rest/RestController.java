package com.sd.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.demo.beans.RedisClient;

@Component
@Path("/cache")
public class RestController {

	@Autowired
	RedisClient redisClient;

	@GET
	@Path("/add/{key}/{val}")
	public String addToCache(@PathParam("key") String key, @PathParam("val") String val) {
		redisClient.getJedis().set(key, val);
		return key + " added successfully";
	}

	@GET
	@Path("/fetch/{key}")
	public String fetchFromCache(@PathParam("key") String key) {
		String str = redisClient.getJedis().get(key);
		return str + " -> value for key:" + key;
	}

}