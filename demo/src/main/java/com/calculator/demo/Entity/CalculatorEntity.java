package com.calculator.demo.Entity;

import javax.persistence.*;

@Entity
public class CalculatorEntity {

    @Id
    private int no;
    @Column
    private Long value1;

    @Column
    private Long value2;

    private String operator;

    public CalculatorEntity() {
    }

    public CalculatorEntity(Long value1, Long value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setValue1(Long value1) {
        this.value1 = value1;
    }

    public Long getValue1() {
        return value1;
    }

    public void setValue2(Long value2) {
        this.value2 = value2;
    }

    public Long getValue2() {
        return value2;
    }

}
