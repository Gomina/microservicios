package com.example.microanuncios.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoriaDTO {
    private int id_categoria;
    private String descripcion;
}
