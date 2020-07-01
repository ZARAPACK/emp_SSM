package com.emp.pojo;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class Employee {

    private Long eid ;

    @NotNull(message="not null")
    private String empname;



    @NotNull(message="not null")
    private String sex;

    @NotNull(message = "not null")
    private String address;

    @Min(value=18,message="not < 18")
    @Max(value=75,message="not > 75")
    @NotNull(message="not null")
    private Integer age;


    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
