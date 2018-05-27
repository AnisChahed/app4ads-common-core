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
    
}
