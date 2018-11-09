package edu.dcccd.lesson11.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Data
public class Transaction {

    private Long id;
    private String time;
    @NotNull
    @NotEmpty
    private String day;
    @NotNull
    @NotEmpty
    private String description;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private String type;

    public Transaction(){
        LocalDateTime now = LocalDateTime.now();
        time = now.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
    }

    public Transaction(Long id, String type,String day, BigDecimal amount, String description){
        LocalDateTime now = LocalDateTime.now();
        time = now.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        this.id=id;
        this.day = day;
        this.description = description;
        this.amount = amount;
        this.type = type;
    }
}
