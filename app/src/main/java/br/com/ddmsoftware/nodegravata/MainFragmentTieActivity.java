package br.com.ddmsoftware.nodegravata;

import android.app.ActionBar;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;


public class MainFragmentTieActivity extends AppCompatActivity {

    ImageView imageView;
    String message;
    List lista;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment_tie);

        //imageView = (ImageView)findViewById(R.id.imgTie);


        // Recebe parametros da MAIN ACTIVITY  { Nome do Nó da Gravata }

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        CustomTieNodeLoader customTieNodeLoader = new CustomTieNodeLoader();

        switch (message) {
            case "FOURINHAND"  : {
                lista = customTieNodeLoader.loadFourInHandsSteps();
                this.setTitle(R.string.four_in_hand);
                break; }
            case "HALF WINDSOR": {
                lista = customTieNodeLoader.loadHalfWindsorSteps();
                this.setTitle(R.string.half_windsor_name);
                break; }
            case "FULL WINDSOR": {
                lista = customTieNodeLoader.loadFullWindsorSteps();
                this.setTitle(R.string.full_windsor_name);
                break; }
            case "NICKY": {
                lista = customTieNodeLoader.loadNickySteps();
                this.setTitle(R.string.nicky_name);
                break; }
            case "BOW TIE": {
                lista = customTieNodeLoader.loadBowTieSteps();
                this.setTitle(R.string.bow_tie_name);
                break; }
            case "KELVIN": {
                lista = customTieNodeLoader.loadKelvinSteps();
                this.setTitle(R.string.kelvin_name);
                break; }
            case "ORIENTAL": {
                lista = customTieNodeLoader.loadOrientalSteps();
                this.setTitle(R.string.oriental_name);
                break; }
            case "PRATT": {
                lista = customTieNodeLoader.loadPrattSteps();
                this.setTitle(R.string.pratt_name);
                break; }
            case "ST. ANDREW": {
                lista = customTieNodeLoader.loadStAndrewSteps();
                this.setTitle(R.string.standrew_name);
                break; }
            case "BALTHUS": {
                lista = customTieNodeLoader.loadBalthusSteps();
                this.setTitle(R.string.balthus_name);
                break; }
            case "HANOVER": {
                lista = customTieNodeLoader.loadHanoverSteps();
                this.setTitle(R.string.hanover_name);
                break; }
            case "PLATTSBURGH": {
                lista = customTieNodeLoader.loadPlattsburgSteps();
                this.setTitle(R.string.plattsburgh_name);
                break; }
            case "GRANTTCHESTER": {
                lista = customTieNodeLoader.loadGranttchesterSteps();
                this.setTitle(R.string.granttchester_name);
                break; }
            case "VICTORIA": {
                lista = customTieNodeLoader.loadVictoriaSteps();
                this.setTitle(R.string.victoria_name);
                break; }
            case "CAFE": {
                lista = customTieNodeLoader.loadCafeSteps();
                this.setTitle(R.string.café_name);
                break; }
            case "ELDREDGE": {
                lista = customTieNodeLoader.loadEldredgeSteps();
                this.setTitle(R.string.eldredge_name);
                break; }
            case "TRINITY": {
                lista = customTieNodeLoader.loadTrinitySteps();
                this.setTitle(R.string.trinity_name);
                break; }
            case "CHRISTENSEN": {
                lista = customTieNodeLoader.loadChristensenSteps();
                this.setTitle(R.string.christensen_name);
                break; }
        }



        //imageView.setImageResource(R.drawable.fourinhand08);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

       // Intent intent = new Intent(getApplicationContext(), MainActivity.class);
       // startActivity(intent);

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */

        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            /*
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            ImageView imageView = (ImageView) rootView.findViewById(R.id.imgTie);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

            TextView textViewTip = (TextView) rootView.findViewById(R.id.textViewTip);
*/

            View rootView = inflater.inflate(R.layout.fragment_main2, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.tvTesteSection);
            ImageView imageView = (ImageView) rootView.findViewById(R.id.imageViewTeste);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

            TextView textViewTip = (TextView) rootView.findViewById(R.id.tvDescTeste);

            // Create a AdView
            // Load Advertisement Banner
            AdView mAdView = (AdView) rootView.findViewById(R.id.adViewTeste);
            AdRequest adRequest = new AdRequest.Builder().build();

            mAdView.loadAd(adRequest);

            List<CustomTieNodeLoader> lista = new ArrayList();


            // Recebe parametros da MAIN ACTIVITY  { Nome do Nó da Gravata }
            Intent intent = getActivity().getIntent();
            String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

            CustomTieNodeLoader customTieNodeLoader = new CustomTieNodeLoader();

            //lista = customTieNodeLoader.loadFourInHandsSteps();

            int i = getArguments().getInt(ARG_SECTION_NUMBER);

            switch (message) {
                case "FOURINHAND"  : { lista = customTieNodeLoader.loadFourInHandsSteps();  break; }
                case "HALF WINDSOR": { lista = customTieNodeLoader.loadHalfWindsorSteps(); break; }
                case "FULL WINDSOR": { lista = customTieNodeLoader.loadFullWindsorSteps(); break; }
                case "NICKY": { lista = customTieNodeLoader.loadNickySteps(); break; }
                case "BOW TIE": { lista = customTieNodeLoader.loadBowTieSteps(); break; }
                case "KELVIN": { lista = customTieNodeLoader.loadKelvinSteps(); break; }
                case "ORIENTAL": { lista = customTieNodeLoader.loadOrientalSteps(); break; }
                case "PRATT": { lista = customTieNodeLoader.loadPrattSteps(); break; }
                case "ST. ANDREW": { lista = customTieNodeLoader.loadStAndrewSteps(); break; }
                case "BALTHUS": { lista = customTieNodeLoader.loadBalthusSteps(); break; }
                case "HANOVER": { lista = customTieNodeLoader.loadHanoverSteps(); break; }
                case "PLATTSBURGH": { lista = customTieNodeLoader.loadPlattsburgSteps(); break; }
                case "GRANTTCHESTER": { lista = customTieNodeLoader.loadGranttchesterSteps(); break; }
                case "VICTORIA": { lista = customTieNodeLoader.loadVictoriaSteps(); break; }
                case "CAFE": { lista = customTieNodeLoader.loadCafeSteps(); break; }
                case "ELDREDGE": { lista = customTieNodeLoader.loadEldredgeSteps(); break; }
                case "TRINITY": { lista = customTieNodeLoader.loadTrinitySteps(); break; }
                case "CHRISTENSEN": { lista = customTieNodeLoader.loadChristensenSteps(); break; }
            }

            imageView.setImageResource(lista.get(i-1).getNodeStepPicture());
            textViewTip.setText(lista.get(i-1).getNodeStepDescription());

            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return lista.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0: {
                    //imageView.setImageResource(R.drawable.fourinhand01);
                    return "SECTION 1";
                }
                case 1:{
                    //imageView.setImageResource(R.drawable.fourinhand02);
                    return "SECTION 2";
                }
                case 2: {
                    //imageView.setImageResource(R.drawable.fourinhand03);
                    return "SECTION 3";
                }
                case 3: {
                    //imageView.setImageResource(R.drawable.fourinhand04);
                    return "SECTION 4";
                }
                case 4: {
                    //imageView.setImageResource(R.drawable.fourinhand05);
                    return "SECTION 5";
                }
                case 5: {
                    //imageView.setImageResource(R.drawable.fourinhand06);
                    return "SECTION 5";
                }
                case 6: {
                    //imageView.setImageResource(R.drawable.fourinhand07);
                    return "SECTION 6";
                }
                case 7: {
                    //imageView.setImageResource(R.drawable.fourinhand08);
                    return "SECTION 7";
                }
            }
            return null;
        }
    }

}
