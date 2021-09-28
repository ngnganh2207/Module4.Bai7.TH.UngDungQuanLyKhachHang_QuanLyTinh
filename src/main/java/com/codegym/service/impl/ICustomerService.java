package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import com.codegym.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
