package exemple.rest.api.Server.repositories;

import exemple.rest.api.Server.entity.Sensor;
import exemple.rest.api.Server.entity.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer> {
    Optional<Sensor> findById(long id);
    Optional<Sensor> findByName(String name);
}