package com.emp.pojo;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class Employee {

    private Integer id ;
    private Integer age;
    @NotNull(message = "{Employee.sex.null}")
    private String sex;
    @NotNull(message = "{Employee.address.null}")
    private String address;
}
