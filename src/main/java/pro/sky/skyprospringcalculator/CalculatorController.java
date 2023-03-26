package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/calculator")

@RestController

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("/")
    public String hello(){
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping("/plus")

    public String plus(
            @RequestParam(value = "num1", required = false) int num1,
            @RequestParam(value = "num2", required = false) int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1,num2);
    }

    @GetMapping("/minus")
    public String minus(
            @RequestParam(value = "num1", required = false) int num1,
            @RequestParam(value = "num2", required = false) int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1,num2);
    }

    @GetMapping("/multiply")
    public String multiply(
            @RequestParam(value = "num1", required = false) int num1,
            @RequestParam(value = "num2", required = false) int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1,num2);
    }

    @GetMapping("/divide")
    public String divide(
            @RequestParam(value = "num1", required = false) int num1,
            @RequestParam(value = "num2", required = false) int num2) {
        if (num2 == 0) {
            return "На 0 делить нельзя!";
        }
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1,num2);
    }
}



