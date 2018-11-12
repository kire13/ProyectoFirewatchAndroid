package cl.firewatch.firewatch;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import cl.firewatch.firewatch.adapters.HumedadAdapter;
import cl.firewatch.firewatch.adapters.HumoAdapter;
import cl.firewatch.firewatch.adapters.TemperaturaAdapter;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MonitorFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MonitorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MonitorFragment extends Fragment {

    ArrayList<String> sectores;
    RecyclerView rv_humo;
    RecyclerView rv_humedad;
    RecyclerView rv_temperatura;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MonitorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MonitorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MonitorFragment newInstance(String param1, String param2) {
        MonitorFragment fragment = new MonitorFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =inflater.inflate(R.layout.fragment_monitor, container, false);

        /*
        rv_humo=view.findViewById(R.id.rv_humo);
        rv_humedad=view.findViewById(R.id.rv_humedad);
        rv_temperatura=view.findViewById(R.id.rv_temperatura);
        rv_humo.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));//set horizontal list
        rv_humedad.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        rv_temperatura.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        sectores=new ArrayList<>();
        for(int i=0;i<10;i++){
            sectores.add(" Sector "+(i+1));
        }
        HumoAdapter humoAdapter=new HumoAdapter(sectores);
        HumedadAdapter humedadAdapter=new HumedadAdapter(sectores);
        TemperaturaAdapter temperaturaAdapter =new TemperaturaAdapter(sectores);
        rv_humo.setAdapter(humoAdapter);
        rv_temperatura.setAdapter(humedadAdapter);
        rv_humedad.setAdapter(temperaturaAdapter);

        */
        SetListHumo(view);
        SetListHumedad(view);
        SetListTemperatura(view);
        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private ArrayList<String> AgregarSectores(){//cambiar por sectores de cada tipo de lista para filtrar...
        ArrayList<String> sectoreslist=new ArrayList<>();
        for(int i=0;i<10;i++){
            sectoreslist.add(" Sector "+(i+1));
        }
        return sectoreslist;
    }

    private void SetListHumo(View view){
        rv_humo=view.findViewById(R.id.rv_humo);
        rv_humo.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        sectores=AgregarSectores();
        HumoAdapter humoAdapter=new HumoAdapter(sectores);
        rv_humo.setAdapter(humoAdapter);
    }

    private void SetListHumedad(View view){
        rv_humedad=view.findViewById(R.id.rv_humedad);
        rv_humedad.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        sectores=AgregarSectores();
        HumedadAdapter humedadAdapter=new HumedadAdapter(sectores);
        rv_humedad.setAdapter(humedadAdapter);
    }

    private void SetListTemperatura(View view){
        rv_temperatura=view.findViewById(R.id.rv_temperatura);
        rv_temperatura.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        ArrayList<String> sectores_temperatura=AgregarSectores();
        TemperaturaAdapter temperaturaAdapter=new TemperaturaAdapter(sectores_temperatura);
        rv_temperatura.setAdapter(temperaturaAdapter);
    }
}
