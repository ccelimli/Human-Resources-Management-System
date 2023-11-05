package com.hrms.business.concretes;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.core.results.DataResult;
import com.hrms.core.results.Result;
import com.hrms.dataAccess.abstracts.EmployerRepository;
import com.hrms.entities.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    EmployerRepository _employerRepository;

    @Autowired
    public EmployerManager(EmployerRepository _employerRepository) {
        this._employerRepository = _employerRepository;
    }

    @Override
    public Result add(Employer employer) {
        return null;
    }

    @Override
    public Result delete(int id) {
        return null;
    }

    @Override
    public Result update(Employer employer) {
        return null;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return null;
    }

    @Override
    public DataResult<Employer> getById(int id) {
        return null;
    }
}
