package com.calculator.demo.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CalculatorService {

//    @Autowired
//    private CalculatorRepository calculatorRepository;

    public Long performOperation(Long value1, Long value2, String operator) {

        if (operator != null) {
            switch (operator) {
                case "Addition":
                case "Add":
                    return value1 + value2;

                case "Subtraction":
                case "Sub": {
                    if (value1 > value2) {
                        return value1 - value1;
                    } else {
                        return value2 - value1;
                    }
                }

                case "Multiply":
                    return value1 * value2;

                case "Division":
                case "Div": {
                    Long result;
                    try {
                        result = value1 / value2;
                    } catch (ArithmeticException e) {
                        throw new ArithmeticException();
                    }
                    return result;
                }

                default:
                    //do nothing
                }
        } else {
           log.info("Invalid Operator");
        }

        return null;
    }
}
