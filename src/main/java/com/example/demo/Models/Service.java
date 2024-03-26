package com.example.demo.Models;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Service {
    @JsonProperty("id")
    private int id;

    @JsonProperty("service_name")
    private String serviceName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("teams")
    private List<String> teams;

    @JsonProperty("onCallService")
    private List<OnCallService> onCallService;

    @JsonProperty("oneITSM")
    private String oneITSM;

    @JsonProperty("url")
    private String url;

    @JsonProperty("contact")
    private String contact;

    @JsonProperty("error")
    private String error;

    // Getter und Setter für alle Felder
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public List<OnCallService> getOnCallService() {
        return onCallService;
    }

    public void setOnCallService(List<OnCallService> onCallService) {
        this.onCallService = onCallService;
    }

    public String getOneITSM() {
        return oneITSM;
    }

    public void setOneITSM(String oneITSM) {
        this.oneITSM = oneITSM;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
