package me.nuncan.hiringmodel.datasources.Neo4j;

import me.nuncan.hiringmodel.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

	User findAllByName(String name);
}