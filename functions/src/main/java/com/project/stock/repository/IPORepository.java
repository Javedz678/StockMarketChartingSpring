package com.project.stock.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.stock.entity.IPO;

public interface IPORepository extends CrudRepository<IPO, Integer> {

}
