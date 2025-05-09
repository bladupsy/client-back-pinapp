package org.client.service;

import org.client.domain.dto.Client;
import org.client.domain.dto.ClientRequestDTO;
import org.client.domain.dto.ClientResponseDTO;
import org.client.domain.dto.KpiClientesDTO;
import org.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void crearCliente(ClientRequestDTO dto) {
        Client client = new Client();
        client.setName(dto.getName());
        client.setLastname(dto.getLastname());
        client.setAge(dto.getAge());
        client.setDateOfBirth(dto.getDateOfBirth());
        clientRepository.save(client);
    }

    public KpiClientesDTO calcularKpis() {
        List<Integer> edades = clientRepository.findAll()
                .stream()
                .map(Client::getAge)
                .toList();

        double promedio = edades.stream().mapToInt(i -> i).average().orElse(0);
        double desviacion = Math.sqrt(
                edades.stream().mapToDouble(i -> Math.pow(i - promedio, 2)).average().orElse(0)
        );

        return new KpiClientesDTO(promedio, desviacion);
    }

    public List<ClientResponseDTO> listarClientes() {
        return clientRepository.findAll().stream().map(c -> {
            LocalDate fechaMuerteEstimada = c.getDateOfBirth().plusYears(75);
            return new ClientResponseDTO(
                    c.getId(),
                    c.getName(),
                    c.getLastname(),
                    c.getAge(),
                    c.getDateOfBirth(),
                    fechaMuerteEstimada
            );
        }).toList();
    }
}
