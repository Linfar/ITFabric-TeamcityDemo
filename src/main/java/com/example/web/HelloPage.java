package com.example.web;

//import com.example.db.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by linfar on 26.10.16.
 */
@Controller
public class HelloPage {
//    private final RegistrationRepository myRepository;

//    @Autowired
//    public HelloPage(@NotNull final RegistrationRepository repository) {
//        myRepository = repository;
//    }

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
//        model.put("registrations", StreamSupport.stream(myRepository.findAll().spliterator(), false).collect(Collectors.toList()));
        return "welcome";
    }
}
