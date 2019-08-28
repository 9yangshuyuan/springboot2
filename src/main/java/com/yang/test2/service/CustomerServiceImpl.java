package com.yang.test2.service;



import com.yang.test2.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl {

    @Autowired
    private CustomerMapper customerMapper;
    public void save(String name, String tel) {
        customerMapper.save(name,tel);
    }

}
