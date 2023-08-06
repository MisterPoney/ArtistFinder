package andreo.marcos.ArtistFinder.Services;

import models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();
    Optional<User> findByID(String id);
    User createUser(User user);
    User updateUser(User user);

    void deleteUser(String id);
}
