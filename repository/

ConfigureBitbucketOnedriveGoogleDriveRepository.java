

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigureBitbucketOnedriveGoogleDriveRepository extends JpaRepository<ConfigureBitbucketOnedriveGoogleDrive, Integer> {
 
    ConfigureBitbucketOnedriveGoogleDrive findByUsernameAndPasswordAndUrlAndRepositoryName(String username, String password, String url, String repositoryName);

}