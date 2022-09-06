package com.example.dynamic_validate.dao;

import com.example.dynamic_validate.entity.SamlRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SamlRuleDao extends JpaRepository<SamlRule, Integer> {

}
