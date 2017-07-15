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

        tieNodes.add(new TieNode(R.drawable.logotipo,  "Four In Hand", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo2, "Half Windsor", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo3,  "Full Windsor", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo4, "Nicky", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo5,  "BOW Tie", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo6, "Kelvin", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo7,  "Oriental", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo8, "Pratt", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo9, "St. Andrew", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo10, "Balthus", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo11, "Hanover", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo12, "Plattsburgh", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo13, "Granttchester", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo14, "Victoria", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo2, "Cafe", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo3, "Eldredge", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo4, "Trinity", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo6, "Christensen", "Classic node for classic people"));

        return tieNodes;
    }


}
