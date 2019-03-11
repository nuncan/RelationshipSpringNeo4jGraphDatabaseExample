package me.nuncan.hiringmodel.datasources.MongoDB.repository;

import me.nuncan.hiringmodel.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MongoReactiveRepo extends ReactiveMongoRepository<User, Long> {
}
