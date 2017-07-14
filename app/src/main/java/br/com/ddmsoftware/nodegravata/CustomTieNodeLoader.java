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


}

