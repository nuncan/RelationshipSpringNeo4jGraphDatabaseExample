package me.nuncan.hiringmodel.datasources.Redis.repository;

import me.nuncan.hiringmodel.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface RedisRepo extends CrudRepository<User, Long> {

}