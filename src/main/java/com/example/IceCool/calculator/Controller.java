package com.example.IceCool.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.FactoryConfigurationError;
import java.util.List;

@RestController
@RequestMapping
public class Controller {

    private Calculator calculator;

    public Calculator(Calculator calculator) {
        this.calculator =calculator;
    }

    @GetMapping
    public List<Calculator>

}
