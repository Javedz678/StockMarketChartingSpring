package com.project.stock.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.stock.entity.StockExchange;

public interface StockExchangeRepository extends CrudRepository<StockExchange, Integer> {

}
