package com.sadman.springmvc.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Sadman on 3/22/2018.
 */
@Entity
public class VerificationToken {
    private static final int EXPIRATION = 60 * 24;

    private int verificationTokenId;
    private String token;
    private Date expiryDate;
    private Employee employee;

    public VerificationToken() {
        super();
    }

    public VerificationToken(final String token) {
        super();

        this.token = token;
        this.expiryDate = calculateExpiryDate(EXPIRATION);
    }

    public VerificationToken(final String token, final Employee employee) {
        super();

        this.token = token;
        this.employee = employee;
        this.expiryDate = calculateExpiryDate(EXPIRATION);
    }

    @Id
    @Column(name = "verificationTokenId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getVerificationTokenId() {
        return verificationTokenId;
    }

    public void setVerificationTokenId(int verificationTokenId) {
        this.verificationTokenId = verificationTokenId;
    }

    @Basic
    @Column(name = "token", nullable = true, length = 255)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @OneToOne
    @JoinColumn(nullable = false, name = "EmployeeId")
    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Basic
    @Column(name = "expiryDate", nullable = true)
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    private Date calculateExpiryDate(final int expiryTimeInMinutes) {
        final Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(new java.util.Date().getTime());
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new java.util.Date(cal.getTime().getTime());
    }

    public void updateToken(final String token) {
        this.token = token;
        this.expiryDate = calculateExpiryDate(EXPIRATION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VerificationToken that = (VerificationToken) o;

        if (verificationTokenId != that.verificationTokenId) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (expiryDate != null ? !expiryDate.equals(that.expiryDate) : that.expiryDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = verificationTokenId;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        return result;
    }
}
