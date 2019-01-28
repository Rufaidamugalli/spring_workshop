package com.example.rufaida;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class HelloController {

    @GetMapping("/hello")
    String greeting() {
        return "hello";
    }
    @GetMapping("/random")
    String random(Model model) {
        List<Double> randomList = new ArrayList<Double>();
        for (int i=0; i<5; i++) {
            final double randoms = new Random().nextDouble();

            randomList.add(randoms);
        }
        model.addAttribute( "randoms", randomList);
        return "random";
    }


}
