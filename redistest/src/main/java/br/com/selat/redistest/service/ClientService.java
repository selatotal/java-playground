package br.com.selat.redistest.service;

import br.com.selat.redistest.contract.ClientDto;
import br.com.selat.redistest.contract.OperationDeskFilterDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {
    public Page<ClientDto> createOperationDeskView(OperationDeskFilterDto filter, Pageable pageable) {
        return new PageImpl<>(List.of(new ClientDto(UUID.randomUUID(), "Client")));
    }
}
