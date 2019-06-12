package surya.com.projectmdp;

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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RangkingCSGOFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RangkingCSGOFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RangkingCSGOFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public RangkingCSGOFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RangkingCSGOFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RangkingCSGOFragment newInstance(String param1, String param2) {
        RangkingCSGOFragment fragment = new RangkingCSGOFragment();
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

    RecyclerView rview;
    RangkingDota2Adapter adapter;
    ArrayList<RangkingDota2> rangkingDota2s;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_rangking_csgo, container, false);
        rangkingDota2s = new ArrayList<RangkingDota2>();
        rangkingDota2s.add(new RangkingDota2("1. Liquid"));
        rangkingDota2s.add(new RangkingDota2("2. Astralis"));
        rangkingDota2s.add(new RangkingDota2("3. Vitality"));
        rangkingDota2s.add(new RangkingDota2("4. ENCE"));
        rangkingDota2s.add(new RangkingDota2("5. Furia"));
        rangkingDota2s.add(new RangkingDota2("6. North"));
        rangkingDota2s.add(new RangkingDota2("7. AVANGAR"));
        rangkingDota2s.add(new RangkingDota2("8. MiBR"));
        rangkingDota2s.add(new RangkingDota2("9. NRG"));
        rangkingDota2s.add(new RangkingDota2("10. Valiance"));
        rangkingDota2s.add(new RangkingDota2("11. fnatic"));
        rangkingDota2s.add(new RangkingDota2("12. Grayhound"));
        rangkingDota2s.add(new RangkingDota2("13. Natus Vincere"));
        rangkingDota2s.add(new RangkingDota2("14. mousesports"));
        rangkingDota2s.add(new RangkingDota2("15. Ninjas in Pyjamas"));
        rangkingDota2s.add(new RangkingDota2("16. Optic Gaming"));
        rangkingDota2s.add(new RangkingDota2("17. FaZe Clan"));
        rangkingDota2s.add(new RangkingDota2("18. ORDER"));
        rangkingDota2s.add(new RangkingDota2("19. Renegades"));
        rangkingDota2s.add(new RangkingDota2("20. Chiefs eSport Club"));

        rview = v.findViewById(R.id.rvRangkingCSGO);
        adapter = new RangkingDota2Adapter(rangkingDota2s);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(v.getContext());
        rview.setLayoutManager(lm);
        rview.setAdapter(adapter);
        return v;
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
}
