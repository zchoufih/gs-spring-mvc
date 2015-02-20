package com.mycompany.app.service;

import java.util.List;

import com.mycompany.app.vo.CustomerVO;

public interface CustomerService {
    List<CustomerVO> loadAll();
}
