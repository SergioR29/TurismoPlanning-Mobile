package com.tfg.myapplication.modelos;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tfg.myapplication.R;

public class EventoViewHolder extends RecyclerView.ViewHolder {

    // Referencias a las vistas del layout item_evento.xml
    public ImageView iconoImageView;
    public TextView tituloTextView;
    public TextView fechaFinTextView;
    public LinearLayout componenteEvento;
    public LinearLayout datosGenerales;

    public EventoViewHolder(@NonNull View itemView) {
        super(itemView);

        // Obtener las referencias a las vistas usando itemView.findViewById()
        componenteEvento = itemView.findViewById(R.id.componente_Evento);
        iconoImageView = itemView.findViewById(R.id.ic_tareaEvento);
        tituloTextView = itemView.findViewById(R.id.tituloEvento);
        fechaFinTextView = itemView.findViewById(R.id.fechaFIN_Evento);
        datosGenerales = itemView.findViewById(R.id.datosGenerales);

        // Puedes establecer listeners aquí si quieres manejar clics en elementos individuales
        itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 // Manejar clic en el elemento de la lista
                 // Puedes obtener la posición con getAdapterPosition()
                 int position = getAdapterPosition();
                 if (position != RecyclerView.NO_POSITION) {
                     // Notificar a tu Fragmento/Activity sobre el clic
                     // (Ver sección de manejo de clics más adelante)

                 }
             }
         });
    }
}
