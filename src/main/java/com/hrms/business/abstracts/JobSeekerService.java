package com.hrms.business.abstracts;

import com.hrms.core.results.DataResult;
import com.hrms.core.results.Result;
import com.hrms.entities.Jobseeker;

import java.util.List;

public interface JobSeekerService {
    Result add(Jobseeker jobseeker);
    Result delete(int id);
    Result update(Jobseeker jobseeker);
    DataResult<List<Jobseeker>> getAll();
    DataResult<Jobseeker> getById(int id);
}
