package id.ac.astra.polman.navogationapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private Button mJSSBtn;
    private Button mQABtn;
    private Button mPartBtn;
    private Button mTroubleBtn;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        mJSSBtn = (Button) v.findViewById(R.id.btnjss);
        mQABtn= (Button) v.findViewById(R.id.btnqa);
        mPartBtn = (Button) v.findViewById(R.id.btnpart);
        mTroubleBtn = (Button) v.findViewById(R.id.btntrouble);

        mJSSBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), JSSActivity.class);
                startActivity(i);
            }
        });

        mQABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mPartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), PartbookActivity.class);
                startActivity(i);
            }
        });

        mTroubleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), ShopmanualActivity.class);
                startActivity(i);
            }
        });

        return v;
    }

}
