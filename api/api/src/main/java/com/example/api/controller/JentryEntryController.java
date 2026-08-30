package com.example.api.controller;
import java.util.*;

import com.example.api.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("/journal")
public class JentryEntryController {

    private Map<Long,JournalEntry> journalEntrys = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getall(){
        return new ArrayList<>(journalEntrys.values());
    }

    @PostMapping
    public String createentry(@RequestBody JournalEntry myentry) {
        journalEntrys.put(myentry.getId(), myentry);
        return "entry success";
    }

    @GetMapping("id/{myId}")
    public JournalEntry getById (@PathVariable long myId) {
        return journalEntrys.get(myId);
    }


    @DeleteMapping ("id/{myId}")
    public JournalEntry deletById (@PathVariable long myId) {
        return journalEntrys.get(myId);
    }



}
