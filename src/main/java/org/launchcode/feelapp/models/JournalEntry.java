package org.launchcode.feelapp.models;




import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class JournalEntry extends AbstractEntity {


    @NotBlank(message = "Please don't leave this blank!")
    @Size(max = 500, message = "The entry is too long!")
    private String writtenEntry;


    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private DailyWater dailyWater;


    private String dailyMood;

    public JournalEntry( String writtenEntry, DailyWater dailyWater, String dailyMood){
        this.writtenEntry = writtenEntry;
        this.dailyWater = dailyWater;
        this.dailyMood = dailyMood;
    }

    public JournalEntry() {}

    public String getWrittenEntry() {
        return writtenEntry;
    }

    public void setWrittenEntry(String writtenEntry) {
        this.writtenEntry = writtenEntry;
    }

    public DailyWater getDailyWater() {
        return dailyWater;
    }

    public void setDailyWater(DailyWater dailyWater) {
        this.dailyWater = dailyWater;
    }

    public String getDailyMood() {
        return dailyMood;
    }

    public void setDailyMood(String dailyMood) {
        this.dailyMood = dailyMood;
    }


}
