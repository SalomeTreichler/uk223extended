package ch.course223.extended.domainModels;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("bestEarning")
    public @ResponseBody ResponseEntity<User> getBestEarningUser() {
        return new ResponseEntity<User>(userService.getBestEarningUser(), HttpStatus.OK);
    }

    @GetMapping("worstEarning")
    public @ResponseBody ResponseEntity<User> getWorstEarningUser() {
        return new ResponseEntity<User>(userService.getWorstEarningUser(), HttpStatus.OK);
    }

    @GetMapping("/evenEarnings")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersWithEvenEarnings() {
        return new ResponseEntity<>(userService.allUsersWithEvenEarnings(), HttpStatus.OK);
    }

    @GetMapping("/oddEarnings")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersWithOddEarnings() {
        return new ResponseEntity<>(userService.allUsersWithOddEarnings(), HttpStatus.OK);
    }

    @GetMapping("/earningMoreThan/{value}")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersEarningMoreThan(@PathVariable int value) {
        return new ResponseEntity<>(userService.allUsersEarningMoreThan(value), HttpStatus.OK);
    }

    @GetMapping("/earningLessThan/{value}")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersEarningLessThan(@PathVariable int value) {
        return new ResponseEntity<>(userService.allUsersEarningLessThan(value), HttpStatus.OK);
    }

    @GetMapping("/earningBetween/{firstValue}/{secondValue}")
    public @ResponseBody ResponseEntity<List<User>> getAllUsersEarningBetween(@PathVariable int firstValue, @PathVariable int secondValue) {
        return new ResponseEntity<>(userService.allUsersEarningBetween(firstValue, secondValue), HttpStatus.OK);
    }

    @PostMapping("")
    public @ResponseBody ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.OK);
    }

}
