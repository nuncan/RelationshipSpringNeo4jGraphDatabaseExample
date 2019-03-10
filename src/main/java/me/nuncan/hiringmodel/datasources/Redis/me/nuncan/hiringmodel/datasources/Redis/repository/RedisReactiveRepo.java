package me.nuncan.hiringmodel.datasources.Redis.repository;

import me.nuncan.hiringmodel.datasources.entity.User;
import org.springframework.data.redis.core.ReactiveRedisOperations;

/**
 *
 * Placeholder for Redis Backed Repo Of Something
 * Currently Using Redis For Session Management
 *
 */
public interface RedisReactiveRepo extends ReactiveRedisOperations<User, Long> {

}
