package com.mycompany.app;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

import com.mycompany.app.service.CustomerService;
import com.mycompany.app.vo.CustomerVO;

import static org.junit.Assert.assertNotNull;

@SpringApplicationConfiguration(classes = Application.class)
public class CustomerServiceTest extends AbstractIntegrationTest {
    @Autowired
    CustomerService customerService;

    @Test
    public void testLoadAll() {
        assertNotNull(customerService.loadAll());
    }
}
