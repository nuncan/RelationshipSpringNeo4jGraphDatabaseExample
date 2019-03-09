package me.nuncan.hiringmodel.datasources.MongoDB.repository;

import me.nuncan.hiringmodel.datasources.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<User, Long> {
}
