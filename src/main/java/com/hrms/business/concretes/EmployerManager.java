package com.hrms.business.concretes;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.core.constant.Messages;
import com.hrms.core.results.DataResult;
import com.hrms.core.results.Result;
import com.hrms.core.results.SuccessDataResult;
import com.hrms.core.results.SuccessResult;
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
        this._employerRepository.save(employer);
        return new SuccessResult(Messages.employerAdded);
    }

    @Override
    public Result delete(int id) {
        this._employerRepository.deleteById(id);
        return new SuccessResult(Messages.employerDeleted);
    }

    @Override
    public Result update(Employer employer) {
        this._employerRepository.save(employer);
        return new SuccessResult(Messages.employerAdded);
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(Messages.employersListed, this._employerRepository.findAll());
    }

    @Override
    public DataResult<Employer> getById(int id) {
        return new SuccessDataResult<Employer>(Messages.employerListed, this._employerRepository.findById(id).orElseThrow());
    }
}
