package com.sadman.springmvc.dao;

import com.sadman.springmvc.model.Employee;
import com.sadman.springmvc.model.VerificationToken;
import org.springframework.stereotype.Repository;

/**
 * Created by Sadman on 3/25/2018.
 */
@Repository("VerificationTokenDao")
public class VerificationTokenDaoImpl extends AbstractDao<Integer,VerificationToken> implements VerificationTokenDao {
    @Override
    public VerificationToken findByToken(Integer tokenId) {
        return getByKey(tokenId);

    }

    @Override
    public VerificationToken findByUser(Employee employee) {
        return null;
    }

    @Override
    public void saveToken(VerificationToken token) {
        persist(token);
    }
}
