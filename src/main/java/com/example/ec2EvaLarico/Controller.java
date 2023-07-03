package com.example.ec2EvaLarico;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class Controller {
    @GetMapping(path="/")
	public String home() {
		return "sm74702897 - Eva Nicole Larico Morocco";
	}

    public String codigo() {
		return "sm74702897";
	}

    public String nombrecompleto() {
		return "Eva Nicole Larico Morocco";
	}
}
