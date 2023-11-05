package com.hrms.webApi.controllers;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.entities.Employer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employer")
public class EmployersController {

    EmployerService _employerService;

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody Employer employer){
        return ResponseEntity.ok(this._employerService.add(employer));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id){
        return ResponseEntity.ok(this._employerService.delete(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody Employer employer){
        return ResponseEntity.ok(this._employerService.update(employer));
    }

    @GetMapping("/getall")
    public ResponseEntity<Object> getAll(){
        return ResponseEntity.ok(this._employerService.getAll());
    }

    @GetMapping("/getbyid/{id}")
    ResponseEntity<Object> getById(@PathVariable int id){
        return ResponseEntity.ok(this._employerService.getById(id));
    }

}
