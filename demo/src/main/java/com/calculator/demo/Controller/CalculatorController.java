package com.calculator.demo.Controller;

import com.calculator.demo.Service.CalculatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/calculate")
    public ResponseEntity getResult(@RequestParam("1") Long value1,
                                    @RequestParam("2") Long value2,
                                    @RequestParam("operator") String operatorTypes) {
        Long result;
        try {
            result = calculatorService.performOperation(value1, value2, operatorTypes);
            return ResponseEntity.ok(result);
        } catch (ArithmeticException e) {
            log.info("A number is divided by zero.");
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            log.info("Exception occurred");
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/")
    public String get() {
        return "Welcome";
    }
}
