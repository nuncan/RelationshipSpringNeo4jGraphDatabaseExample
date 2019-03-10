package me.nuncan.hiringmodel.datasources.MongoDB.repository;

import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@ConditionalOnEnabledResourceChain
public interface MongoReactiveRepo extends ReactiveMongoRepository<me.nuncan.hiringmodel.datasources.entity.User, Long> {
}
