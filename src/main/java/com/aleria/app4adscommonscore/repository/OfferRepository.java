/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aleria.app4adscommonscore.repository;

import com.aleria.app4adscommonscore.domain.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author Anis
 */
public interface OfferRepository extends JpaRepository<Offer, Long>, JpaSpecificationExecutor<Offer>{
    
}
