package com.example.myjobapp.job;

import java.util.List;

public interface JobService {
  List<Job> findAll();
  void createJob(Job job);

  Job getJobById(Long Id);

  Boolean deleteJobById(Long id);

  boolean updateJobById(Long id, Job updatedJob);
}
