package me.nuncan.hiringmodel.datasources.MongoDB.repository;

import me.nuncan.hiringmodel.datasources.User;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@ConditionalOnEnabledResourceChain
public interface MongoReactiveRepo extends ReactiveMongoRepository<User, Long> {
}
