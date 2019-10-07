package com.trilogyed.rewardsservice.controller;

import com.trilogyed.rewardsservice.exception.RewardsNotFoundException;
import com.trilogyed.rewardsservice.models.Rewards;
import com.trilogyed.rewardsservice.repository.RewardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RewardsController {
    @Autowired
    RewardsRepository repo;

    @RequestMapping(value = "/rewards/type/{roomType}", method = RequestMethod.GET)
    public Rewards getRewards(@PathVariable String roomType) {
        Optional<Rewards> rewards = repo.findRewardsByRoomType(roomType);
        if (rewards.isPresent()) {
            return rewards.get();
        }
        throw new RewardsNotFoundException(roomType);
    }
    @RequestMapping(value = "/rewards", method = RequestMethod.GET)
    public List<Rewards> getAllRewards(){
        return repo.findAll();
    }
}
