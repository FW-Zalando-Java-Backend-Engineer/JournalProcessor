package org.example;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Processes journal entries using StringBuilder and StringBuffer.
 */
public class JournalProcessor {

    /**
     * Appends a timestamp to the journal entry content.
     * Uses StringBuilder for single-threaded efficiency.
     * StringBuilder is not thread-safe
     *
     * @param entry JournalEntry object
     * */
    public void appendTimestamp(JournalEntry entry){
        StringBuilder sb = new StringBuilder(entry.getContent());
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        /**
         * LocalDateTime.now(): Fetches the current system date and time (without time zone). e.g. 2025-05-13T14:50:23.456
         * .format(...) : Formats the LocalDateTime into a String using the given formatter.
         * DateTimeFormatter.ISO_DATE_TIME : yyyy-MM-dd'T'HH:mm:ss.SSS , A built-in formatter that outputs in ISO-8601 format.
         * */


    }

}
