package com.tfg.myapplication.modelos; // O el paquete donde guardes tus modelos de datos

// Puedes usar java.util.Date o java.time.LocalDate si necesitas manejar fechas más complejas
import android.graphics.drawable.Drawable;

import java.util.Date;

public class Evento {
    private String titulo;
    private String fechaFin; // O String si prefieres guardar la fecha como texto
    private byte[] iconoBlob; // <-- Ahora es un byte[] para el icono (Blob)
    private String color;
    private Drawable estilo;
    // Puedes añadir más propiedades según necesites (descripción, color, etc.)

    // Constructor
    public Evento(String titulo, String fechaFin, byte[] iconoBlob, String color) {
        this.titulo = titulo;
        this.fechaFin = fechaFin;
        this.iconoBlob = iconoBlob;
        this.color = color;
    }

    public Drawable getEstilo() {
        return estilo;
    }

    public void setEstilo(Drawable estilo) {
        this.estilo = estilo;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public byte[] getIconoBlob() {
        return iconoBlob;
    }

    public String getColor() {
        return color;
    }

    // Puedes añadir setters si necesitas modificar los datos después de crear el objeto

    // Opcional: toString() para depuración
    @Override
    public String toString() {
        return "Evento{" +
                ", titulo='" + titulo + '\'' +
                ", fechaFin=" + fechaFin +
                ", iconoBlob=" + (iconoBlob != null ? iconoBlob.length + " bytes" : "null") + // Mostrar tamaño del blob o null
                ", color=" + color +
                '}';
    }
}
