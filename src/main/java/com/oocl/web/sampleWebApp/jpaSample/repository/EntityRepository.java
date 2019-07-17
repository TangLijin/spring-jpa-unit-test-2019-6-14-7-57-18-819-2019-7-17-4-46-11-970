package com.oocl.web.sampleWebApp.jpaSample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

public interface EntityRepository extends JpaRepository<Entity,Long> {
}
