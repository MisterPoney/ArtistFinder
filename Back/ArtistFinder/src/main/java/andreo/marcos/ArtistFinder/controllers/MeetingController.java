package andreo.marcos.ArtistFinder.controllers;

import andreo.marcos.ArtistFinder.Services.MeetingService;
import models.Meeting;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/meeting")
public class MeetingController {

    @Autowired
    private MeetingService meetingService;

    @GetMapping
    public ResponseEntity<List<Meeting>> getAll(){
        return ResponseEntity.ok(this.meetingService.getAllMeetings());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Meeting>> getByID(@PathVariable(name = "id") String id){
        return ResponseEntity.ok(this.meetingService.findMeetingByID(id));
    }

    @PostMapping
    public ResponseEntity<Meeting> createUser(@RequestBody Meeting meeting){
        return ResponseEntity.ok(this.meetingService.createMeeting(meeting));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Meeting> updateUser(@PathVariable(name = "id") String id, @RequestBody Meeting meeting){
        return ResponseEntity.ok(this.meetingService.updateMeeting(meeting));
    }

    @DeleteMapping
    public void delete(@PathVariable(name = "id") String id){
        this.meetingService.deleteMeeting(id);
    }
}
