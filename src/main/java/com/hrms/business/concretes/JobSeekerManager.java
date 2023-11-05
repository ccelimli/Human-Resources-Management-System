package com.hrms.business.concretes;

import com.hrms.business.abstracts.JobSeekerService;
import com.hrms.core.results.DataResult;
import com.hrms.core.results.Result;
import com.hrms.dataAccess.abstracts.JobSeekerRepository;
import com.hrms.entities.Jobseeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    JobSeekerRepository _jobSeekerRepository;

    @Autowired
    public JobSeekerManager(JobSeekerRepository _jobSeekerRepository) {
        this._jobSeekerRepository = _jobSeekerRepository;
    }

    @Override
    public Result add(Jobseeker jobseeker) {
        return null;
    }

    @Override
    public Result delete(int id) {
        return null;
    }

    @Override
    public Result update(Jobseeker jobseeker) {
        return null;
    }

    @Override
    public DataResult<List<Jobseeker>> getAll() {
        return null;
    }

    @Override
    public DataResult<Jobseeker> getById(int id) {
        return null;
    }
}
