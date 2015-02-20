package com.mycompany.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.app.core.Customer;
import com.mycompany.app.repository.CustomerRepository;
import com.mycompany.app.service.CustomerService;
import com.mycompany.app.vo.CustomerVO;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<CustomerVO> loadAll() {
        ModelMapper modelMapper = new ModelMapper();
        List<CustomerVO> customerVOList = new ArrayList<CustomerVO>();
        for (Customer customer : customerRepository.findAll()) {
            customerVOList.add(modelMapper.map(customer, CustomerVO.class));
        }

        return customerVOList;
    }
}
