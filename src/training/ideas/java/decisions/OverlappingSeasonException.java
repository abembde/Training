package training.ideas.java.decisions;


import java.util.Date;


public class OverlappingSeasonException extends Exception {


    public OverlappingSeasonException(Date newSeason_startDate, Date newSeason_endDate, Date oldSeason_startDate, Date oldSeasonEndDate) {


        super("New Season with start" + newSeason_startDate + "and" + newSeason_endDate + " is overlapping with season" + oldSeason_startDate + "To" + oldSeasonEndDate);


    }
}
