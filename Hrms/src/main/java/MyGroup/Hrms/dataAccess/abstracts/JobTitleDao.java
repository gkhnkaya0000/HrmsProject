package MyGroup.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MyGroup.Hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {

}
