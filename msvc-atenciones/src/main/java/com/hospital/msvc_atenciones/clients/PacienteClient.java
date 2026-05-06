package com.hospital.msvc_atenciones.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "msvc-pacientes", url = "https://localhost:8002/api/v1/pacientes")
public class PacienteClient {
    @GetMapping("/{id}")
    PacienteDTO getPacienteById
}
