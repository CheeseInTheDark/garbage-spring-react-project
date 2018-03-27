package net.jmlproductions.spreacting.controller;

import net.jmlproductions.spreacting.data.Hamster;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/hamsters")
public class HamsterController {

    @RequestMapping(method= RequestMethod.GET, produces="application/json")
    public List<Hamster> get() {
        return asList(
                new Hamster("Fred", 3),
                new Hamster("George", 1)
        );
    }
}
