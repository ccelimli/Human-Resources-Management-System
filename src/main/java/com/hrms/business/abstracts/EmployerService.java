package com.hrms.business.abstracts;

import com.hrms.core.results.DataResult;
import com.hrms.core.results.Result;
import com.hrms.entities.Employer;

import java.util.List;

public interface EmployerService {
    Result add(Employer employer);
    Result delete(int id);
    Result update(Employer employer);
    DataResult<List<Employer>> getAll();
    DataResult<Employer> getById(int id);
}
