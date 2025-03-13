package com.mthree.demo.controller;

import com.mthree.demo.model.CalcRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello/{user}")
    public String helloWorld( @PathVariable String user) {
        return "<h1>Hello, " + user + "</h1>";
    }

    @PostMapping("/calc")
    public String calculate(int oper1, String operator, int oper2){
        int result = 0;
        switch (operator) {
            case "+":
                result = oper1 + oper2;
                break;
            case "-":
                result = oper1 - oper2;
                break;
            case "*":
                result = oper1 * oper2;
                break;
            case "/":
                result = oper1 / oper2;
                break;
            default:
                String message = String.format("operator '%s' is invalid", operator);
                throw new IllegalArgumentException(message);
        }
        return String.format("%s %s %s = %s", oper1, operator, oper2, result);
    }

    @PostMapping("/calc2")
    public String calculate(@RequestBody CalcRequest req){
        int result = 0;
        switch (req.getOperator()) {
            case "+":
                result = req.getOper1() + req.getOper2();
                break;
            case "-":
                result = req.getOper1() - req.getOper2();
                break;
            case "*":
                result = req.getOper1() * req.getOper2();
                break;
            case "/":
                result = req.getOper1() / req.getOper2();
                break;
            default:
                String message = String.format("operator '%s' is invalid", req.getOperator());
                throw new IllegalArgumentException(message);
        }
        return String.format("%s %s %s = %s", req.getOper1(), req.getOperator(), req.getOper2(), result);
    }

//     @PutMapping()
//     @PathVariable
//     @DeleteMapping()
}
