package com.sadman.springmvc.dao;

import com.sadman.springmvc.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.stream.Stream;

/**
 * Created by Sadman on 3/22/2018.
 */
public interface VerificationTokenRepository  extends JpaRepository<VerificationToken, Long>  {
}
