package com.mycompany.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.app.service.CustomerService;
import com.mycompany.app.vo.CustomerVO;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView loadAll() {
        ModelMap model = new ModelMap();
        List<CustomerVO> customerVOList = customerService.loadAll();
        model.addAttribute("customerVOList", customerVOList);

        return new ModelAndView("customer", model);
    }
}
