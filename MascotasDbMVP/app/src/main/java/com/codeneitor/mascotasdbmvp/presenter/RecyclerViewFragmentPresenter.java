package com.codeneitor.mascotasdbmvp.presenter;

import android.content.Context;
import com.codeneitor.mascotasdbmvp.model.ConstructorMascotas;
import com.codeneitor.mascotasdbmvp.model.Mascota;
import com.codeneitor.mascotasdbmvp.view.fragment.IRecyclerViewFragmentView;
import java.util.ArrayList;

/**
 * Created by b41n on 9/01/19.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas creadorContactos;
    private ArrayList<Mascota> contactos;

    public  RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasDB();
    }

    @Override
    public void obtenerMascotasDB() {
        creadorContactos = new ConstructorMascotas(context);
        contactos = creadorContactos.obtenerMascotas();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdapterRV(iRecyclerViewFragmentView.crearAdapter(contactos));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
