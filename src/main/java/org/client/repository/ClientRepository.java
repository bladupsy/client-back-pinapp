

package org.client.repository;

import org.client.domain.dto.ClientDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.client.domain.dto.Client;

import java.util.Arrays;
import java.util.List;

public interface ClientRepository extends JpaRepository<ClientDTO, Long> {

}
