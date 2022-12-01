package org.launchcode.feelapp.models;


import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class JournalEntry extends AbstractEntity {



    @Size(max = 500, message = "The entry is too long!")
    private String writtenEntry;





}
