package org.launchcode.feelapp.data;


import org.launchcode.feelapp.models.JournalEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends CrudRepository<JournalEntry, Integer> {
}
