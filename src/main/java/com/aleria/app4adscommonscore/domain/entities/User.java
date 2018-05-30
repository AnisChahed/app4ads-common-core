/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aleria.app4adscommonscore.domain.entities;

import com.aleria.app4adscommonscore.domain.enumerations.UserEnum;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 *
 * @author Anis
 */
@Entity
@Table(name="com_user")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class User implements Serializable{

    private static final long serialVersionUID = -307676013570903683L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long Id;
    
    @Column(name = "email")
    @NotNull
    protected String email;
    
    @Column(name = "name")
    @NotNull
    protected String name;
    
    @Column(name = "last_name")
    @NotNull
    protected String lastName;
    
    @Column(name = "type")
    @NotNull
    @Enumerated(EnumType.STRING)
    protected UserEnum type;
    
    @Column(name = "activated")
    @NotNull
    protected Boolean isActive;
    
    @Column(name = "subscribed")
    @NotNull
    protected Boolean isSubscribed;
    
    @Column(name = "creation")
    @NotNull
    protected LocalDateTime creation;
    
    @Column(name = "expirancy")
    protected LocalDateTime expirancy;
    
    @Column(name = "subscription")
    protected LocalDateTime subscription;
    
    @Column(name = "lastConnection")
    protected LocalDateTime lastConnection;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserEnum getType() {
        return type;
    }

    public void setType(UserEnum type) {
        this.type = type;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    public LocalDateTime getExpirancy() {
        return expirancy;
    }

    public void setExpirancy(LocalDateTime expirancy) {
        this.expirancy = expirancy;
    }

    public LocalDateTime getSubscription() {
        return subscription;
    }

    public void setSubscription(LocalDateTime subscription) {
        this.subscription = subscription;
    }

    public LocalDateTime getLastConnection() {
        return lastConnection;
    }

    public void setLastConnection(LocalDateTime lastConnection) {
        this.lastConnection = lastConnection;
    }
}
