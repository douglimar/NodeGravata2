package br.com.ddmsoftware.nodegravata;

import android.content.res.Resources;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmoraes on 12/07/2017.
 */

public class TieNode {

    int nodePicture;
    String nodeDescription;
    String nodeComplement;

    public int getNodePicture(){
        return  nodePicture;
    }

    public void setNodePicture(int nodePicture){
        this.nodePicture = nodePicture;
    }

    public String getNodeComplement() {
        return nodeComplement;
    }

    public void setNodeComplement(String nodeComplement) {
        this.nodeComplement = nodeComplement;
    }


    public String getNodeDescription() {
        return nodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    TieNode(int nodePicture, String nodeDescription, String nodeComplement) {
        this.nodePicture = nodePicture;
        this.nodeDescription = nodeDescription;
        this.nodeComplement = nodeComplement;
    }

    TieNode(){

    }

    public List initializeData() {

        List<TieNode> tieNodes = new ArrayList<>();

        tieNodes.add(new TieNode(R.drawable.logotipo,   "Four In Hand", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo2,  "Half Windsor", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo3,  "Full Windsor", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo4,  "Nicky", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo5,  "Bow Tie", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo6,  "Kelvin", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo7,  "Oriental (or Simple)", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo8,  "Pratt", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo9,  "St. Andrew", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo10, "Balthus", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo11, "Hanover", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo12, "Plattsburgh", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo13, "Granttchester", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo14, "Victoria", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo2,  "Cafe", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo3,  "Eldredge", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo4,  "Trinity", ""));
        tieNodes.add(new TieNode(R.drawable.logotipo7,  "Christensen", ""));

        return tieNodes;
    }


}
