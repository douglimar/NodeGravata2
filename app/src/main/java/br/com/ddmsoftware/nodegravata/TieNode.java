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

        tieNodes.add(new TieNode(R.drawable.logotipo, "Four In Hand", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo2, "2-Half Windsor", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo, "3-Full Windsor", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo2, "4-Nicky", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo, "5-BOW Tie", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo2, "6-Kelvin", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo, "7-Oriental", "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo2, "8-Pratt", "Classic node for classic people"));

        return tieNodes;
    }


}
