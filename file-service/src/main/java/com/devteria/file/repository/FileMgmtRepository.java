package com.devteria.file.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.devteria.file.entity.FileMgmt;
public interface FileMgmtRepository extends MongoRepository<FileMgmt, String> {
    
}
