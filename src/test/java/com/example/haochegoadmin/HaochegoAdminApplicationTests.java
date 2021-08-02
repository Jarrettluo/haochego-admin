package com.example.haochegoadmin;

import com.example.haochegoadmin.entity.Company;
import com.example.haochegoadmin.mapper.CompanyMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HaochegoAdminApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private CompanyMapper companyMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Company> companyList = companyMapper.selectList(null);
        for(Company company:companyList) {
            System.out.println(company);
        }
    }

}
