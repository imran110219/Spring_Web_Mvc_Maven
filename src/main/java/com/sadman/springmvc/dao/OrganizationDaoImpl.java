package com.sadman.springmvc.dao;

import com.sadman.springmvc.model.Organization;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Sadman on 2/25/2018.
 */
@Repository("OrganizationDao")
public class OrganizationDaoImpl extends AbstractDao<Integer, Organization> implements OrganizationDao{
    public Organization findById(int id) {
        return getByKey(id);
    }

    public void saveOrganization(Organization organization) {
        persist(organization);
    }

    public void deleteOrganizationById(int organizationId) {
        Query query = getSession().createSQLQuery("delete from Organization where organizationId = :organizationId");
        query.setInteger("organizationId", organizationId);
        query.executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<Organization> findAllOrganizations() {
        Criteria criteria = createEntityCriteria();
        return (List<Organization>) criteria.list();
    }

    public Organization findOrganizationByOrganizatioName(String organizatioName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("organizatioName", organizatioName));
        return (Organization) criteria.uniqueResult();
    }
}
