package com.golfservice.golfservice.service.interfaces;

import com.golfservice.golfservice.dto.PlayerDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfacePlayerService extends JpaRepository<PlayerDTO, Integer> {
}
