package andreo.marcos.ArtistFinder.Services.ServicesImpl;

import andreo.marcos.ArtistFinder.Repository.UserRepository;
import andreo.marcos.ArtistFinder.Services.UserService;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<User> findByID(String id) {
        return this.userRepository.findById(id);
    }

    @Override
    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {
        this.userRepository.deleteById(id);
    }
}
