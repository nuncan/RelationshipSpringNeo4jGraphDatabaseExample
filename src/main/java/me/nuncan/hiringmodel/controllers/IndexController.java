package me.nuncan.hiringmodel.controllers;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class IndexController {
    @GetMapping
    public String getIndex(@NotNull Model model) {
        log.debug("Endpoint hit");
        model.addAttribute("Index");
        return "Index";
    }

}
