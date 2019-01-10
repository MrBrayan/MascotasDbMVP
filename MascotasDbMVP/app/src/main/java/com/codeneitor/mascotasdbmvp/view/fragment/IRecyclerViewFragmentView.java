package com.codeneitor.mascotasdbmvp.view.fragment;

import com.codeneitor.mascotasdbmvp.adapter.MascotaAdapter;
import com.codeneitor.mascotasdbmvp.model.Mascota;

import java.util.ArrayList;

/**
 * Created by b41n on 7/01/19.
 */

public interface IRecyclerViewFragmentView {
    public void generarLinearLayoutVertical();

    public MascotaAdapter crearAdapter(ArrayList<Mascota> mascotas);

    public void inicializarAdapterRV(MascotaAdapter adapter);
}
