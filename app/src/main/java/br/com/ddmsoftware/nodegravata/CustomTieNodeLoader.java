package br.com.ddmsoftware.nodegravata;

import android.content.res.Resources;

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

        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand01, Resources.getSystem().getString(R.string.four_in_hand_step1)));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand02, Resources.getSystem().getString(R.string.four_in_hand_step2)));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand03, Resources.getSystem().getString(R.string.four_in_hand_step3)));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand04, Resources.getSystem().getString(R.string.four_in_hand_step4)));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand05, Resources.getSystem().getString(R.string.four_in_hand_step5)));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand06, Resources.getSystem().getString(R.string.four_in_hand_step6)));
        myList.add(new CustomTieNodeLoader(R.drawable.fourinhand07, Resources.getSystem().getString(R.string.four_in_hand_step7)));

        return myList;
    }

    public List loadHalfWindsorSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor01,   Resources.getSystem().getString(R.string.half_windsor01)));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor02,   Resources.getSystem().getString(R.string.half_windsor02)));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor03,   Resources.getSystem().getString(R.string.half_windsor03)));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor04,   Resources.getSystem().getString(R.string.half_windsor04)));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor05,   Resources.getSystem().getString(R.string.half_windsor05)));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor06,   Resources.getSystem().getString(R.string.half_windsor06)));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor07,   Resources.getSystem().getString(R.string.half_windsor07)));
        myList.add(new CustomTieNodeLoader(R.drawable.half_windsor08,   Resources.getSystem().getString(R.string.half_windsor08)));
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

        myList.add( new CustomTieNodeLoader(R.drawable.bowtie1,"1. Cross the longer end over the shorter end."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie2,"2. Loop the long end under where the two ends cross."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie3,"3. Fold the dangling end to make a loop."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie4,"4. Drop the longer end over the skinny center of the bow. "));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie5,"5. Pinch the bow together in front of the long end."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie6,"6. Feed the middle of the dangling end back through the knot."));
        myList.add( new CustomTieNodeLoader(R.drawable.bowtie7,""));

        return  myList;
    }

    public List loadKelvinSteps(){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.kelvin1,"1. Start with the backside of the tie facing away from you, the wide end is on the right and the small end is on the left. Move only the active (wide) end."));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin2,"2. Wide end under the small end to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin3,"3. Across the small end to the right."));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin4,"4. Under the small end to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin5,"5. Across the small end to the right."));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin6,"6. Up into the neck loop from underneath."));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin7,"7. Down through the loop you've just made in the front."));
        myList.add( new CustomTieNodeLoader(R.drawable.kelvin8,"8. Pull down on the wide end to tighten. Slide the knot up to adjust."));

        return  myList;
    }

    public List loadOrientalSteps(){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.oriental1,"1. Start with the backside of the tie facing away from you, the wide end is on the right and the small end is on the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental2,"2. Wide end under the small end to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental3,"3. Across the small end to the right."));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental4,"4. Up into the neck loop from underneath."));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental5,"5. Down through the loop you've just made in the front."));
        myList.add( new CustomTieNodeLoader(R.drawable.oriental6,"6. Pull down on the wide end to tighten. Slide the knot up to adjust."));

        return  myList;
    }

    public List loadPrattSteps(){
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.pratt1,"Drape the necktie around your collar – with its seam (back side) facing outward. The thick end should be hanging on your left, and the thin end on your right."));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt2,"Cross the thick end underneath the thin end – forming an X-shape below your chin. This creates a similar loop to the one used in tying a Half-Windsor."));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt3,"Pass the thick end through the loop. Bring it back out over to the right side of the knot once more."));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt4,"Pull the thick end all the way downward – with its seam facing outward once again. Flip the tip so that it’s pointing to your left."));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt5,"Bring the thick end horizontally across the front of the knot (from right to left). At this point, the seam of the thick end is now facing inward."));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt6,"Slip the thick end through the loop (coming from underneath it). The will make the seam face outward once again. Keep your finger in place."));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt7,"Pull the thick end all the way down through the horizontal band. Snug it firmly into place. You now have the finished structure of the knot (it should stay put without your help if you try releasing it)."));
        myList.add( new CustomTieNodeLoader(R.drawable.pratt8,"Finally, adjust the necktie by grasping the knot with one hand – while pulling on the narrow end gently with the other. Fix the dimple of the tie so it looks even better on you."));

        return  myList;
    }


    public List<CustomTieNodeLoader> loadStAndrewSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.standrew1,"Drape the necktie around your collar with the backside exposed. The thick end should be hanging on your left, while the thin end is over to your right."));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew2,"Cross the thin end horizontally over the thick end, forming an X-shape under your chin. Use one hand to keep a firm grasp of the intersection point."));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew3,"Bring the thick end horizontally across the front of the thin end. At this point, the thick end should be pointing to your left – while the thin end is hanging straight down."));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew4,"Continue looping the thick end around the thin end – passing it horizontally behind the thin end from left to right. At this point, the thick end should now be pointing to your right – with its backside exposed."));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew5,"Flip the thick end vertically up and over the front of the knot. Then tuck it back downward behind the knot. You should finish this step with the thick end pointing straight down – directly behind the thin end."));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew6,"Bring the thick end horizontally to the left of the thin end. The seam should still be facing outward. This is supposed to pull down the vertical loop you made across the knot in Step #5."));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew7,"Bring the thick end horizontally across the front of the knot from left to right – covering the vertical loop you made in Step #5. This will form a horizontal band in the front. Slip a finger through it – you’ll be needing it for the next step."));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew8,"Bring the thick end up behind the knot, and tuck it through the horizontal loop you made in Step #7. This is where the shape of the knot is completed."));
        myList.add( new CustomTieNodeLoader(R.drawable.standrew9,"Pull the thick end all the way through. Tighten the knot by grasping it with one hand – while pulling carefully on the thick end with the other."));

        return  myList;
    }

    public List<CustomTieNodeLoader> loadBalthusSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.balthus1, "1. Begin with the backside of your tie facing forward with the wide end of the tie on the right and the small end on the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus2, "2. Wide end under the small end to the left. Up to the center, towards the neck loop."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus3, "3. Through the neck loop and down to the right."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus4, "4. Up to the center, towards the neck loop."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus5, "5. Through the neck loop and down to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus6, "6. Up to the center, towards the neck loop."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus7, "7. Through the neck loop and down to the right."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus8, "8. Across the front of the small end to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus9, "9. Up into the neck loop from underneath."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus10,"10. Down through the loop you've just made in the front."));
        myList.add( new CustomTieNodeLoader(R.drawable.balthus11,"11. Pull down on the wide end to tighten. Slide the knot up to adjust."));

        return  myList;

    }

    public List<CustomTieNodeLoader> loadHanoverSteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.hanover1,"1. At the beginning, the wide end of the tie should be on your right side and the other end should be on your left side. Note that the tie should begin inside out."));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover2,"2. Cross the narrow end over the other end. Now three regions are formed (Left, Right and Center)."));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover3,"3. Bring the wide end over the narrow end from Left to Right."));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover4,"4. Bring the wide end up from the Right region to the Center region."));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover5,"5. Bring the wide end over the tie knot from the Center region to the Left region."));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover6,"6. Bring the wide end under the narrow end from Left to Right."));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover7,"7. Bring the wide end up from Right to Center."));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover8,"8. Bring the wide end underneath the tie knot to the Left region."));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover9,"9. Bring the wide end over the tie knot to the Right region."));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover10,"10. Bring the wide end up from the Right region to the Center region." ));
        myList.add( new CustomTieNodeLoader(R.drawable.hanover11,"11. Bring the wide end down and pass the loop in front. Ensure that the knot is tightened."));

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

        myList.add( new CustomTieNodeLoader(R.drawable.victoria1,"Drape the necktie around your collar with its seam (back side) covered. The thick end should hang on your left side, while the narrow end is on your right."));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria2,"Cross the thick end of the tie horizontally in front of the narrow end, forming an X-shape below your chin. The thick end should now be on the right side."));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria3,"Continue wrapping the thick end around the narrow end, now crossing in front of the knot from left to right. Point the tip of the thick end toward the back – preparing it for another turn."));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria4,"Make a second turn around the narrow end – bringing the tie behind it and crossing again from right to left. This horizontal fold will be stacked on top of the previous one. This creates the bulk of the knot."));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria5,"Bring the thick end horizontally across the front of the knot again – crossing from left to right."));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria6,"Insert the thick end through the loop around your collar, coming from underneath it. It should end up in front of your chin – with the seam exposed once more."));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria7,"Feed the thick end downward through the horizontal band you created in Step #5. The thick end should be pulled all the way through – lying directly over the narrow end and covering it."));
        myList.add( new CustomTieNodeLoader(R.drawable.victoria8,"Snug the thick end into place. At this point, you have the finished shape of the knot. It should stand on its own even if you move your hands away."));

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

        myList.add( new CustomTieNodeLoader(R.drawable.eldredge1,"1. Start with the wide end of the tie on the left and the small end on the right. "));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge2,"2. Small end over the wide end to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge3,"3. Under the wide end and to the right.  Up to the center, towards neck loop."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge4,"4. Through the neck loop and to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge5,"5. Across the front, to the right. Then up into the neck loop from underneath."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge6,"6. Down to the left and around the back of the wide end to the right. Keep this part loose."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge7,"7. Bring it across the front towards the left and through the loop made in the previous step."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge8,"8. Pull the small end towards the left to tighten."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge9,"9. Up to the center, towards neck loop. Down through the neck loop and to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge10,"10. Up to the center, towards neck loop. Down through the neck loop and to the right. Keep this part loose."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge11,"11. Across the front towards the left and through the loop made in the previous step."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge12,"12. Pull the small end towards the left to tighten."));
        myList.add( new CustomTieNodeLoader(R.drawable.eldredge13,"13. Tuck the rest of the small end behind neck loop on the left side."));
        return  myList;

    }

    public List<CustomTieNodeLoader> loadTrinitySteps() {
        List<CustomTieNodeLoader> myList = new ArrayList<>();

        myList.add( new CustomTieNodeLoader(R.drawable.trinity1, "1. Start with the wide end of the tie on the left and the small end on the right. The tip of the wide end should rest at the top of your belt buckle. Only move the active (small) end."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity2, "2. Over the wide end to the left. Up into the neck loop from underneath."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity3, "3. Down to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity4, "4. Around the back of the wide end to the right."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity5, "5. Up to the center, towards neck loop."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity6, "6. Through the neck loop and down to the left."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity7, "7. Across the wide end to the right. Up into the neck loop from underneath."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity8, "8. Down through the loop you created in the previous step. Keep loose."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity9, "9. Bring the small end around the back of the wide end to the right."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity10,"10. Bring it across the front towards the center and through the loop created in the previous step."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity11,"11. Tighten and tuck the rest of the small end behind neck loop on the left side."));
        myList.add( new CustomTieNodeLoader(R.drawable.trinity12,"12. Hypnotize the throngs of onlookers."));

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

