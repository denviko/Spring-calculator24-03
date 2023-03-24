package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;


@Service

public class CalculatorService {

    public String Calculator() {
        return "calculator";
    }

    public String answerCalculator() {
        return "Добро пожаловать в калькулятор.";
    }

}

