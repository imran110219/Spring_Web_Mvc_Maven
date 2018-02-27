package com.sadman.springmvc.dao;

import com.sadman.springmvc.model.Organization;

import java.util.List;

/**
 * Created by Sadman on 2/25/2018.
 */
public interface OrganizationDao {
    Organization findById(int id);

    void saveOrganization(Organization organization);

    void deleteOrganizationById(int organizationId);

    List<Organization> findAllOrganizations();

    Organization findOrganizationByOrganizatioName(String organizatioName);
}
