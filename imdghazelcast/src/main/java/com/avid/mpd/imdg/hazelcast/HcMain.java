package com.avid.mpd.imdg.hazelcast;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Slf4j
public class HcMain {
    public static void main(String[] args) {
        LOGGER.info("Starting HcMain: " + LocalDateTime.now());
    }
}
