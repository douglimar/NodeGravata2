package br.com.ddmsoftware.nodegravata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    public static final String EXTRA_MESSAGE = new String ("br.com.ddmsoftware.nodegravata.MESSAGE");


    String[] aNodeTypes = {"FOURINHAND","HALF WINDSOR","FULL WINDSOR","NICKY","BOW TIE",
            "KELVIN","ORIENTAL","PRATT","ST.ANDREW","BALTHUS","HANOVER","PLATTSBURGH",
            "GRANTTCHESTER","VICTORIA","CAFE","ELDREDGE","TRINITY","CHRISTENSEN"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        createListView();


        // Create a AdView
        // Load Advertisement Banner
        AdView mAdView = (AdView) findViewById(R.id.adViewMainActivity);
        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);

    }

    public void createListView(){

        TieNode tieNode = new TieNode();

        ArrayList<TieNode> tieNodes = (ArrayList<TieNode>) tieNode.initializeData();
        ListView lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(new CustomItemListBaseAdapter(this, tieNodes));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                loadTieNodeInfoActivity(i);

                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "1");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "On Tie Node Click");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
            }
        });

    }

    public void loadTieNodeInfoActivity(int position){

        Intent intent = new Intent(this, MainFragmentTieActivity.class);
        intent.putExtra(EXTRA_MESSAGE, aNodeTypes[position]);
        startActivity(intent);
    }

}
