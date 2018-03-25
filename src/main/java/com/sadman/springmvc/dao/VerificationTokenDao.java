package com.sadman.springmvc.dao;

import com.sadman.springmvc.model.Employee;
import com.sadman.springmvc.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.stream.Stream;

/**
 * Created by Sadman on 3/22/2018.
 */
public interface VerificationTokenDao   {


    VerificationToken findByToken(Integer tokenId);

    VerificationToken findByUser(Employee employee);

    void saveToken(VerificationToken token);

//
//    Stream<VerificationToken> findAllByExpiryDateLessThan(Date now);
//
//    void deleteByExpiryDateLessThan(Date now);
//
//    @Modifying
//    @Query("delete from VerificationToken t where t.expiryDate <= ?1")
//    void deleteAllExpiredSince(Date now);
}
