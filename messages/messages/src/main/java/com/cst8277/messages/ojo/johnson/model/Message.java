package com.cst8277.messages.ojo.johnson.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="messages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    private Long id;

    @Column(nullable = true)
    @JsonProperty
    private String content;

    @Column(nullable = true)
    @JsonProperty
    private Long created;

    @ManyToOne()
    @JoinColumn(name="producer_id" , referencedColumnName = "id")
    @JsonProperty
    @NotNull
    private Producer producer;



}


