/**
 * 
 */
package dev.mission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.mission.entite.Mission;
/** 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public interface MissionRepository extends JpaRepository<Mission, Integer> {

}
