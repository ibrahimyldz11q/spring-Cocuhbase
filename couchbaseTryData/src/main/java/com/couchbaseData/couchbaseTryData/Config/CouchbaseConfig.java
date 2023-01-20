package com.couchbaseData.couchbaseTryData.Config;

import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Arrays;

public class CouchbaseConfig extends AbstractCouchbaseConfiguration {
    @Override
    public String getConnectionString() {
        return "localhost:8091";
    }

    @Override
    public String getUserName() {
        return "Administrator";

    }

    @Override
    public String getPassword() {
        return "roottoor";
    }

    @Override
    public String getBucketName() {
        return "customer";
    }

}
