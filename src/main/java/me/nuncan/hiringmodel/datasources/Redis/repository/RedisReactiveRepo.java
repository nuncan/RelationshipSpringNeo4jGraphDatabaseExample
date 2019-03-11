package me.nuncan.hiringmodel.datasources.Redis.repository;

import me.nuncan.hiringmodel.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Placeholder for Redis Backed Repo Of Something
 * Currently Using Redis For Session Management
 */

public interface RedisReactiveRepo extends ReactiveCrudRepository<User, Long> {

}
