package andreo.marcos.ArtistFinder.Services;

import models.Meeting;

import java.util.List;
import java.util.Optional;

public interface MeetingService {

    List<Meeting> getAllMeetings();
    Optional<Meeting> findMeetingByID(String id);
    Meeting createMeeting(Meeting meeting);
    Meeting updateMeeting(Meeting meeting);

    void deleteMeeting(String id);
}
