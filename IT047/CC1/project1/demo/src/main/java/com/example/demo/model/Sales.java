package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sales")
public class Sales {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

     private Long loginId;
     private String salesmail;
    
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Long getLoginId() {
        return loginId;
    }
    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }
    public String getSalesmail() {
        return salesmail;
    }
    public void setSalesmail(String salesmail) {
        this.salesmail = salesmail;
    }
   
    

     
    

    
}
