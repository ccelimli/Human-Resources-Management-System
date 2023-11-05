package com.hrms.dataAccess.abstracts;

import com.hrms.entities.Jobseeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepository extends JpaRepository<Jobseeker,Integer> {
}
