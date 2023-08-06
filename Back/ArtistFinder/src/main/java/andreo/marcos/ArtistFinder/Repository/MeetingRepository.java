package andreo.marcos.ArtistFinder.Repository;

import models.Meeting;
import models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MeetingRepository extends MongoRepository<Meeting, String> {
}
