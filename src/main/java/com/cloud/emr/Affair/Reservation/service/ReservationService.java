package com.cloud.emr.Affair.Reservation.service;

import com.cloud.emr.Affair.Reservation.entity.ReservationEntity;
import com.cloud.emr.Affair.Reservation.repository.ReservationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;






}
