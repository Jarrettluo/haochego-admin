package com.example.haochegoadmin.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Company {
    Long id;
    String companyName;
    String abbreviation;
    Integer validAccount;
    Timestamp expirationTime;
    Timestamp createTime;
    Timestamp modifyTime;
}
