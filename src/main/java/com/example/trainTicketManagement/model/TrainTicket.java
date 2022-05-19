package com.example.trainTicketManagement.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "BookedFlight")
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrainTicket {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.EAGER)
    @JoinColumn(name = "passenger_id")
    private List<Passenger> passengers;

    @OneToOne(cascade = CascadeType.ALL, fetch =FetchType.EAGER )
    @JoinColumn(name = "train_id")
    private Train train;

    public TrainTicket(List<Passenger> passengers, Train train) {
        this.passengers = passengers;
        this.train = train;
    }
}
