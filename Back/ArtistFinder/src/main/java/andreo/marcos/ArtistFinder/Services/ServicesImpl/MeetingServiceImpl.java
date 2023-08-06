package andreo.marcos.ArtistFinder.Services.ServicesImpl;

import andreo.marcos.ArtistFinder.Repository.MeetingRepository;
import andreo.marcos.ArtistFinder.Repository.UserRepository;
import andreo.marcos.ArtistFinder.Services.MeetingService;
import models.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;
    @Override
    public List<Meeting> getAllMeetings() {
        return this.meetingRepository.findAll();
    }

    @Override
    public Optional<Meeting> findMeetingByID(String id) {
        return this.meetingRepository.findById(id);
    }

    @Override
    public Meeting createMeeting(Meeting meeting) {
        return this.meetingRepository.save(meeting);
    }

    @Override
    public Meeting updateMeeting(Meeting meeting) {
        return this.meetingRepository.save(meeting);
    }

    @Override
    public void deleteMeeting(String id) {
        this.meetingRepository.deleteById(id);
    }
}
