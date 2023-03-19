/*
package com.sap.demo.repository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Employee> findByEmployeeIdAndDepartmentIdIn(List<EmployeeIdDepartmentId> employeeIdDepartmentIds) {

        */
/*Criteria[] criterias = new Criteria[employeeIdDepartmentIds.size()];
        for (int i = 0; i < employeeIdDepartmentIds.size(); i++) {
            EmployeeIdDepartmentId empDepId = employeeIdDepartmentIds.get(i);
            Criteria criteria = Criteria.where("employeeId").is(empDepId.getEmployeeId())
                    .and("departmentId").is(empDepId.getDepartmentId());
            criterias[i] = criteria;
        }*//*

        Criteria criteria = new Criteria();
        Set<Criteria> criterias = employeeIdDepartmentIds.stream()
                .map(key -> Criteria.where("employeeId").is(key.getEmployeeId()).andOperator(Criteria.where("departmentId").is(key.getDepartmentId())))
                .collect(Collectors.toSet());
        Query query = new Query(criteria.orOperator(criterias));
        return mongoTemplate.find(query, Employee.class);
    }
    

}


class Employee {
    private String name;
    private String employeeId;
    private String departmentId;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}*/
