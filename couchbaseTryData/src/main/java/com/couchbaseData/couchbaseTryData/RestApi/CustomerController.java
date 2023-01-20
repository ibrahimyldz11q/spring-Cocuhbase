package com.couchbaseData.couchbaseTryData.RestApi;

import com.couchbaseData.couchbaseTryData.Entities.Customer;
import com.couchbaseData.couchbaseTryData.Repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomerController {
    CustomerRepository customerRepository;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "customer saved";
    }


    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<Customer>();
        Iterator<Customer> it = customerRepository.findAll().iterator();
        while(it.hasNext()) {
            customers.add(it.next());
        }
        return customers;



    }
}
