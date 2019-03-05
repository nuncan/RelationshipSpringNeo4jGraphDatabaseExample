package me.nuncan.hiringmodel.controllers;

import lombok.extern.slf4j.Slf4j;
import me.nuncan.hiringmodel.datasources.Neo4j.UserService;
import me.nuncan.hiringmodel.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/db")
class IndexController {

	@Resource
	UserService userService;


	@GetMapping(path = {"/find/{name}"})
	User findAllByName(@RequestParam String name) {
		log.info("Returning all users and customers on index hit {}", name);
		return userService.findAllByName(name);

	}



}
