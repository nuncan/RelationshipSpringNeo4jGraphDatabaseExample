package me.nuncan.hiringmodel.datasources.MongoDB.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<me.nuncan.hiringmodel.datasources.entity.User, Long> {
}
