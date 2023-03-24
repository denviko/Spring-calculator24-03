package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String Calculator() {
        return calculatorService.Calculator();
    }
    @GetMapping(path = "/calculator")
    public String answerCalculator(){
        return calculatorService.answerCalculator();
    }

}


