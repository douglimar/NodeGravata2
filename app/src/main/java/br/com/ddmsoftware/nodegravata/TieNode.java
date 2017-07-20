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

        tieNodes.add(new TieNode(R.drawable.logotipo,   Resources.getSystem().getString(R.string.four_in_hand), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo2,  Resources.getSystem().getString(R.string.half_windsor_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo3,  Resources.getSystem().getString(R.string.full_windsor_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo4,  Resources.getSystem().getString(R.string.nicky_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo11, Resources.getSystem().getString(R.string.hanover_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo5,  Resources.getSystem().getString(R.string.bow_tie_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo6,  Resources.getSystem().getString(R.string.kelvin_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo7,  Resources.getSystem().getString(R.string.oriental_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo8,  Resources.getSystem().getString(R.string.pratt_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo9,  Resources.getSystem().getString(R.string.standrew_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo10, Resources.getSystem().getString(R.string.balthus_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo12, Resources.getSystem().getString(R.string.plattsburgh_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo13, Resources.getSystem().getString(R.string.granttchester_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo14, Resources.getSystem().getString(R.string.victoria_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo2,  Resources.getSystem().getString(R.string.café_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo3,  Resources.getSystem().getString(R.string.eldredge_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo4,  Resources.getSystem().getString(R.string.trinity_name), "Classic node for classic people"));
        tieNodes.add(new TieNode(R.drawable.logotipo7,  Resources.getSystem().getString(R.string.christensen_name), "Classic node for classic people"));

        return tieNodes;
    }


}
