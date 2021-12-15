package com.freelance.department.service.controller;

import com.freelance.department.service.entity.Department;
import com.freelance.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @PostMapping("/")
  public Department saveDepartment(@RequestBody Department department) {
    log.info("Inside saveDepartment method of DepartmentController");
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/{id}")
  public Department findDepartmentById(@PathVariable("id") Long departmentId) {
    log.info("Inside findDepartmentById method of DepartmentController");
    return departmentService.findDepartmentById(departmentId);
  }

}
