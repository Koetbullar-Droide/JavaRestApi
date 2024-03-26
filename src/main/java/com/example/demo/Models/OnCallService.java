package com.example.demo.Models;
import com.fasterxml.jackson.annotation.JsonProperty;

class OnCallService {
    @JsonProperty("name")
    private String name;

    @JsonProperty("sms")
    private String sms;

    @JsonProperty("email")
    private String email;

    @JsonProperty("voice")
    private String voice;

    // Getter und Setter für alle Felder
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}