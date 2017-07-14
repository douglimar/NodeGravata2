package br.com.ddmsoftware.nodegravata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmoraes on 13/07/2017.
 */

public class CustomTieNodeLoader {

    int nodeStepPicture;
    String nodeStepDescription;

    public int getNodeStepPicture() {
        return nodeStepPicture;
    }

    public void setNodeStepPicture(int nodeStepPicture) {
        this.nodeStepPicture = nodeStepPicture;
    }

    public String getNodeStepDescription() {
        return nodeStepDescription;
    }

    public void setNodeStepDescription(String nodeStepDescription) {
        this.nodeStepDescription = nodeStepDescription;
    }

    CustomTieNodeLoader(){

    }

    CustomTieNodeLoader(int nodeStepPicture, String nodeStepDescription){
        this.nodeStepPicture = nodeStepPicture;
        this.nodeStepDescription = nodeStepDescription;
    }

    public List loadFourInHandsSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand01, "1. Start with the wide end of the tie on the right and the small end on the left. Begin with the small end slightly above your belly-button (will vary depending on your height and the length & thickness of your tie). Only move the active (wide) end."));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand02, "2. Wide end over the small end to the left"));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand03, "3. Under the small end and to the right"));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand04, "4. Across the front and to the left"));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand05, "5. Up into the neck loop from underneath"));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand06, "6. Down through the loop you've just made in the front"));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand07, "7. Tighten the knot by pulling down on the wide end. Slide the knot up & adjust."));

        return myList;
    }

    public List loadHalfWindsorSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor01, "Start with the wide end of the tie on the right and the small end on the left. The tip of the small end should rest slightly above your belly-button (this will vary depending on your height and the length & thickness of your tie). Only move the active (wide) end."));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor02, "Wide end over the small end to the left."));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor03, "Under the small end and to the right."));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor04, "Up to the center, towards neck loop. Through the neck loop and to the left."));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor05, "Across the front, over to the right."));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor06, "Up into the neck loop from underneath."));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor07, "Down through the loop you've just created in the front."));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor08, "Tighten the knot by pulling down on the wide end. Slide the knot up & adjust."));

        return myList;

    }


    public List loadFullWindsorSteps(){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor1,"1. Start with the wide end of the tie on the right and the small end on the left. The tip of the small end should rest slightly above your belly-button (this will vary depending on your height and the length & thickness of your tie). Only move the active (wide) end."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor2,"2. Wide end over the small end to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor3,"3. Up into the neck loop from underneath."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor4,"4. Down to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor5,"5. Around the back of the small end to the right."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor6,"6. Up to the center, towards neck loop."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor7,"7. Through the neck loop and down to the right."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor8,"8. Across the front to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor9,"9. Up into the neck loop from underneath."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor10,"10. Down through the loop you've just created in the front."));
        myList.add( new CustomTieNodeLoader(R.drawable.full_windsor11,"11. Tighten the knot by pulling down on the wide end. Slide the knot up & adjust."));

        return  myList;
    }


    public List loadNickySteps(){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.nicky1,"1. At the beginning, the wide end of the tie should be on your right side and the other end should be on your left side. Note that the tie should begin inside out."));
        myList.add( new CustomTieNodeLoader(R.drawable.nicky2,"2. Cross the narrow end over the other end. Now three regions are formed (Left, Right and Center)."));
        myList.add( new CustomTieNodeLoader(R.drawable.nicky3,"3. Bring the wide end over the narrow end to the Center region."));
        myList.add( new CustomTieNodeLoader(R.drawable.nicky4,"4. Bring the wide end down from Center to Right."));
        myList.add( new CustomTieNodeLoader(R.drawable.nicky5,"5. Bring the wide end over the knot from Right to Left."));
        myList.add( new CustomTieNodeLoader(R.drawable.nicky6,"6. Bring the wide end under the narrow part of the tie from the Left region to the Center region."));
        myList.add( new CustomTieNodeLoader(R.drawable.nicky7,"7. Bring the wide end down and pass the loop in front. Ensure that the knot is tightened."));
        myList.add( new CustomTieNodeLoader(R.drawable.nicky8,"8. Use one hand to pull the narrow end down gently and use the other hand to move the knot up until it reaches the center of the collar."));

        return  myList;
    }


    public List loadBowTieSteps(){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.bowtie1,"Cross the longer end over the shorter end."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie2,"Loop the long end under where the two ends cross."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie3,"Fold the dangling end to make a loop."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie4,"Drop the longer end over the skinny center of the bow. "));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie5,"Pinch the bow together in front of the long end."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie6,"Feed the middle of the dangling end back through the knot."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie7,""));

        return  myList;
    }

    public List loadKelvinSteps(){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.kelvin1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin8,""));

        return  myList;
    }

    public List loadOrientalSteps(){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.oriental1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental6,""));

        return  myList;
    }

    public List loadPrattSteps(){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.pratt1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt8,""));

        return  myList;
    }


    public List<CustomTieNodeLoader> loadStAndrewSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.standrew1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew9,""));

        return  myList;
    }

    public List<CustomTieNodeLoader> loadBalthusSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.balthus1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus11,""));

        return  myList;

    }

    public List<CustomTieNodeLoader> loadHanoverSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.hanover1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover11,""));

        return  myList;

    }

    public List loadPlattsburgSteps() {

        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.plattsburgh9,""));
        return  myList;

    }

    public List<CustomTieNodeLoader> loadGranttchesterSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.grantchestter11,""));
        return  myList;

    }

    public List loadVictoriaSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.victoria1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria8,""));

        return  myList;
    }

    public List<CustomTieNodeLoader> loadCafeSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.cafe1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.cafe11,""));

        return  myList;

    }

    public List loadEldredgeSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.eldredge1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge11,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge12,""));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge13,""));
        return  myList;

    }

    public List<CustomTieNodeLoader> loadTrinitySteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.trinity1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity11,""));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity12,""));
        return  myList;

    }

    public List loadChristensenSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.christensen1,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen2,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen3,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen4,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen5,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen6,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen7,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen8,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen9,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen10,""));
        myList.add( new CustomTieNodeLoader(R.drawable.christensen11,""));
        return  myList;

    }
}

