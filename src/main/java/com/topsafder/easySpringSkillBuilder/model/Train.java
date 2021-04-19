package com.topsafder.easySpringSkillBuilder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "trains")
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Train {

    public Train() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "distance_between_stop")
    @JsonProperty("distance-between-stop")
    private String distanceBetweenStop;

    @Column(name = "max_speed")
    @JsonProperty("max-speed")
    private String maxSpeed;

    @Column(name = "sharing_tracks")
    @JsonProperty("sharing-tracks")
    private Boolean sharingTracks;

    @Column(name = "grade_crossing")
    @JsonProperty("grade-crossing")
    private Boolean gradeCrossing;

    @Column(name = "train_frequency")
    @JsonProperty("train-frequency")
    private String trainFrequency;

    @Column(name = "amenities")
    @JsonProperty("amenities")
    private String amenities;
}
