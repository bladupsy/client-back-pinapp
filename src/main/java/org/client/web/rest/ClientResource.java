package org.client.web.rest;


import org.client.domain.dto.ClientDTO;
import org.client.domain.dto.ClientResponseDTO;
import org.client.domain.dto.KpiClientesDTO;
import org.client.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientResource {

    private final ClientService clientService;

    public ClientResource(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/creacliente")
    public ResponseEntity<Void> crearCliente(@RequestBody  ClientDTO dto) {
        clientService.crearCliente(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/kpideclientes")
    public KpiClientesDTO obtenerKpis() {
        return clientService.calcularKpis();
    }

    @GetMapping("/istclientes")
    public List<ClientResponseDTO> listarClientes() {
        return clientService.listarClientes();
    }
}
