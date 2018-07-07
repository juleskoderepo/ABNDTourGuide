package com.example.android.abndtourguideaustin;

/**
 * {@link LocalSpeak} represents a common word or phrase for which locals have their own
 * terminology or slang.
 */
public class LocalSpeak {

    /**
     * Common word or phrase
     */
    private String common_speak;

    /**
     * Local translation for common word or phrase
     */
    private String local_speak;

    /**
     * Constructs a new LocalSpeak object with common speak and local speak
     *
     * @param commonSpeak Common usage of word or phrase
     * @param localSpeak  Local usage of word or phrase
     */
    public LocalSpeak(String commonSpeak, String localSpeak) {
        common_speak = commonSpeak;
        local_speak = localSpeak;

    }

    /**
     * Gets the common word or phrase.
     *
     * @return Common usage of word or phrase to display
     */
    public String getCommonSpeak() {
        return common_speak;
    }

    /**
     * Gets the local word or phrase.
     *
     * @return Local usage of word or phrase to display
     */
    public String getLocalSpeak() {
        return local_speak;
    }

}
