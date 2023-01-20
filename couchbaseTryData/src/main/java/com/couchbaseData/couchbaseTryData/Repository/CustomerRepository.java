package com.couchbaseData.couchbaseTryData.Repository;
import com.couchbaseData.couchbaseTryData.Entities.Customer;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends CouchbaseRepository<Customer,Integer> {
    

}
