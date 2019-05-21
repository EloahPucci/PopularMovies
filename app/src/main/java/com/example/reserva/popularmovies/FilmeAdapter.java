package com.example.reserva.popularmovies;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.ViewHolderFilme> {
    private List<Filme> listaDeFilmes;

    public FilmeAdapter(List<Filme> listaDeFilmes) {
        this.listaDeFilmes = listaDeFilmes;
    }

    public class ViewHolderFilme extends RecyclerView.ViewHolder {

        public ImageView imgFilme;

        public ViewHolderFilme(@NonNull View itemView) {
            super(itemView);

            imgFilme = (ImageView) itemView.findViewById(R.id.capaGrid);
        }
    }

    @NonNull
    @Override
    public FilmeAdapter.ViewHolderFilme onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.filme_linha, viewGroup, false);
        ViewHolderFilme viewHolderFilme = new ViewHolderFilme(view);

        return viewHolderFilme;
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeAdapter.ViewHolderFilme viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return listaDeFilmes.size();
    }
}
