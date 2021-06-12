package MyGroup.Hrms.business.abstracts;

import java.util.List;

import MyGroup.Hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
