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
 * {@link MatchesCSGOFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MatchesCSGOFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MatchesCSGOFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MatchesCSGOFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MatchesCSGOFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MatchesCSGOFragment newInstance(String param1, String param2) {
        MatchesCSGOFragment fragment = new MatchesCSGOFragment();
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
    MatchesDota2Adapter adapter;
    ArrayList<MatchesDota2> matchesDota2s;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_matches_csgo, container, false);
        matchesDota2s = new ArrayList<MatchesDota2>();
        matchesDota2s.add(new MatchesDota2("NRG","Mythic",R.drawable.nrg,R.drawable.mythic));
        matchesDota2s.add(new MatchesDota2("Singularity","BNB",R.drawable.singularity,R.drawable.bnb));
        matchesDota2s.add(new MatchesDota2("Sprout","NoChange",R.drawable.sprout,R.drawable.no_change));
        matchesDota2s.add(new MatchesDota2("Liquid","Team Spirit",R.drawable.liquid,R.drawable.spirit));
        matchesDota2s.add(new MatchesDota2("Offset Esports","DreamEater",R.drawable.offset,R.drawable.dreameater));


        rview = v.findViewById(R.id.rvMatchesCSGO);
        adapter = new MatchesDota2Adapter(matchesDota2s);
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
