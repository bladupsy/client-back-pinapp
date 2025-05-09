

package org.client.repository;

import org.client.domain.dto.ClientDTO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<ClientDTO, Long> {

}
