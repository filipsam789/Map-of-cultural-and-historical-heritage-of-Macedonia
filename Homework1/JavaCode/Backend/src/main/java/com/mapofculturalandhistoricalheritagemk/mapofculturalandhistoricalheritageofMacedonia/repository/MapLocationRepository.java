package com.mapofculturalandhistoricalheritagemk.mapofculturalandhistoricalheritageofMacedonia.repository;

import com.mapofculturalandhistoricalheritagemk.mapofculturalandhistoricalheritageofMacedonia.models.MapLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MapLocationRepository extends JpaRepository<MapLocation, String> {
}
