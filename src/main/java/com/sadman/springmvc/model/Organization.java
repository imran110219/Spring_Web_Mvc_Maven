package com.sadman.springmvc.model;

import javax.persistence.*;

/**
 * Created by Sadman on 2/20/2018.
 */
@Entity
@Table(name = "ORGANIZATION", schema = "dbo", catalog = "sample")
public class Organization {
    private int organizationId;
    private String organizatioName;

    @Id
    @Column(name = "organizationId", nullable = false)
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "organizatioName", nullable = false, length = 80)
    public String getOrganizatioName() {
        return organizatioName;
    }

    public void setOrganizatioName(String organizatioName) {
        this.organizatioName = organizatioName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organization that = (Organization) o;

        if (organizationId != that.organizationId) return false;
        if (organizatioName != null ? !organizatioName.equals(that.organizatioName) : that.organizatioName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = organizationId;
        result = 31 * result + (organizatioName != null ? organizatioName.hashCode() : 0);
        return result;
    }
}
