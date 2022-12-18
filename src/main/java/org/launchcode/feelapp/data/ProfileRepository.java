package org.launchcode.feelapp.data;

import org.launchcode.feelapp.models.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer > {
}
