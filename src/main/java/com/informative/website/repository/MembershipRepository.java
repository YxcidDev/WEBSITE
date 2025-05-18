package com.informative.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informative.website.model.MembershipModel;

@Repository
public interface MembershipRepository extends JpaRepository<MembershipModel, Long> {

}
