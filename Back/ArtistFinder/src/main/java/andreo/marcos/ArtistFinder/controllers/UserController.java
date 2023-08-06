package andreo.marcos.ArtistFinder.controllers;

import andreo.marcos.ArtistFinder.Services.UserService;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(this.userService.getAllUsers());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<User>> getByID(@PathVariable(name = "id") String id){
        return ResponseEntity.ok(this.userService.findByID(id));
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(this.userService.createUser(user));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(name = "id") String id, @RequestBody User user){
        return ResponseEntity.ok(this.userService.updateUser(user));
    }

    @DeleteMapping
    public void delete(@PathVariable(name = "id") String id){
        this.userService.deleteUser(id);
    }
}
