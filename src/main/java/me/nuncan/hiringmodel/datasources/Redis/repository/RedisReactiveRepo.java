package me.nuncan.hiringmodel.datasources.Redis.repository;

import me.nuncan.hiringmodel.datasources.User;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.data.redis.core.ReactiveRedisOperations;

@ConditionalOnEnabledResourceChain
public interface RedisReactiveRepo extends ReactiveRedisOperations<User, Long> {

}
