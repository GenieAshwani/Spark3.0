package com.genie.Train.enitity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;


@Entity
public class TrainSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "train_id")
    @JsonManagedReference
    private Train train;

    @ManyToOne
    @JoinColumn(name="source_station_id")
    private Station source;

    @ManyToOne
    @JoinColumn(name="destination_station_id")
    private Station destination;

    private String departureTime;
    private String arrivalTime;

    public TrainSchedule()
    {

    }

    public TrainSchedule(Long id, Train train, Station source, Station destination, String departureTime, String arrivalTime) {
        this.id = id;
        this.train = train;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getSource() {
        return source;
    }

    public void setSource(Station source) {
        this.source = source;
    }

    public Station getDestination() {
        return destination;
    }

    public void setDestination(Station destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
