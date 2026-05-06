package com.hospital.msvc_atenciones.models.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class pacienteDTO {
    private Long pacienteId;
    private String run;
    private String nombreCompleto;

}
