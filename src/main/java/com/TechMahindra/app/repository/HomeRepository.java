package com.TechMahindra.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TechMahindra.app.model.Employee;

@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer>
{

}
