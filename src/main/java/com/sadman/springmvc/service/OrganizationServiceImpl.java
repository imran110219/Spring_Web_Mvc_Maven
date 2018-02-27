package com.sadman.springmvc.service;

import com.sadman.springmvc.dao.OrganizationDao;
import com.sadman.springmvc.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sadman on 2/25/2018.
 */
@Transactional
@Service("OrganizationService")
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationDao dao;

    public Organization findById(int id) {
        return dao.findById(id);
    }

    public void saveOrganization(Organization organization) {
        dao.saveOrganization(organization);
    }

    /*
     * Since the method is running with Transaction, No need to call hibernate update explicitly.
     * Just fetch the entity from db and update it with proper values within transaction.
     * It will be updated in db once transaction ends.
     */
    public void updateOrganization(Organization organization) {
        Organization entity = dao.findById(organization.getOrganizationId());
        if(entity!=null){
            entity.setOrganizatioName(organization.getOrganizatioName());
        }
    }

    public void deleteOrganizationById(int organizationId) {
        dao.deleteOrganizationById(organizationId);
    }

    public List<Organization> findAllOrganizations() {
        return dao.findAllOrganizations();
    }

    public Organization findOrganizationByOrganizatioName(String organizatioName) {

        return dao.findOrganizationByOrganizatioName(organizatioName);
    }

    public boolean isOrganizatioNameUnique(Integer organizationId, String organizatioName) {
        Organization organization = findOrganizationByOrganizatioName(organizatioName);
        return ( organization == null || ((organizationId != null) && (organization.getOrganizationId() == organizationId)));
    }
}
